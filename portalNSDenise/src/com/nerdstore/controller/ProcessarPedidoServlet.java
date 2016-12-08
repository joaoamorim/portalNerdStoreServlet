package com.nerdstore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nerdstore.ConsultaCEP;
import com.nerdstore.ConsultaCEP_Service;
import com.nerdstore.InformacaoCEP;

/**
 * Servlet implementation class TratarPedidoServlet
 */
@WebServlet("/processarPedido")
public class ProcessarPedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ConsultaCEP processoCompraService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcessarPedidoServlet() {
		super();
		this.processoCompraService = getConsultaCEP();
	}

	private ConsultaCEP getConsultaCEP() {
		if (this.processoCompraService == null) {
			this.processoCompraService = new ConsultaCEP_Service().getConsultaCEPSOAP();
		}
		return processoCompraService;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/plain");
			PrintWriter out = response.getWriter();

			Map<String, String[]> parameters = request.getParameterMap();
			for (String parameter : parameters.keySet()) {
				System.out.println("REQUEST PARAMETER - " + parameter.toUpperCase() + " : "
						+ request.getParameter(parameter) + "<br />");
			}

			String nomeCliente = request.getParameter("Nome");
			String cep = request.getParameter("CEP");
			String email = request.getParameter("E-mail");
			String cartao = request.getParameter("Número do cartão");
			String cartaoVenc = request.getParameter("Data de vencimento do cartão");

			System.out.println("cartaoVenc: " + cartaoVenc);

			// Tratanto formato do vencimento do cartao
			String[] vencFormat = cartaoVenc.split("-");
			cartaoVenc = vencFormat[1] + "/" + vencFormat[0];

			System.out.println("cartaoVenc: " + cartaoVenc);

			String qtdeRoboDomestico = (request.getParameter("Robô Domestico")); // Robo
																					// Domestico
																					// Ark
			String qtdeRoboMedico = (request.getParameter("Robô Médico")); // Robo
																			// Domestico
																			// Solar
			String qtdeRoboSeguranca = (request.getParameter("Robô Segurança")); // Robo
																					// Seguranca
																					// Ark
			String qtdeReatorArk = (request.getParameter("Reator Ark")); // Robo
																			// Seguranca
																			// Solar
			String qtdeReatorSolar = (request.getParameter("Reator Solar")); // Robo
																				// Medico
																				// Ark

			// FIXME: Comentar para passar, enquanto não for possível chamar o
			// serviço BPEL na máquina do Rafael
			ConsultaCEP nerdstoreBPELService = getConsultaCEP();
			InformacaoCEP confirmacaoPedido = nerdstoreBPELService.consultarCEP(cep, nomeCliente, email, cartao,
					cartaoVenc, qtdeReatorArk, qtdeReatorSolar, qtdeRoboMedico, qtdeRoboSeguranca, qtdeRoboDomestico);

			// // FIXME: MOCK TO PASS
			// InformacaoCEP confirmacaoPedido = null;
			// confirmacaoPedido = new InformacaoCEP();
			// confirmacaoPedido.setBrRobotic("1");
			// confirmacaoPedido.setBrRobotic1("2");
			// confirmacaoPedido.setBrRobotic2("3");
			// confirmacaoPedido.setCep(cep);
			// confirmacaoPedido.setEndereco("Rua " +
			// System.currentTimeMillis());
			// confirmacaoPedido.setEstado("SC");
			// confirmacaoPedido.setNewElement("Element " +
			// System.currentTimeMillis());
			// confirmacaoPedido.setNewElement1("Element 1 " +
			// System.currentTimeMillis());
			// confirmacaoPedido.setNewElement2("Element 2 " +
			// System.currentTimeMillis());
			// confirmacaoPedido.setNewElement3("Element 3 " +
			// System.currentTimeMillis());
			// // FIXME: MOCK TO PASS

			out.write("Solicitação do cliente: " + nomeCliente + "\n");

			out.write("\n\nResultado:\n\n");

			if (confirmacaoPedido == null) {
				out.write("Pedido não efetivado.\n\n");
				out.write("Favor tentar novamente.\n");
			} else {
				out.write("Resposta: \n\n" + confirmacaoPedido.toString() + "\n");
				out.write("\n\nObrigado por comprar na Nedstore.\n\n");
				out.write("Volte sempre.\n");

				/*
				 * "Nome", "endereco", "Email", "BrRoboticsCodigo",
				 * "StarkSystemCodigo", "TotalStark", "TotalBrRobotics",
				 * "TransacaoCard", "Bandeira", "ValorTotalCompra"
				 */

				// Verificar com o Rafael o novo nome dos parâmetros retornados
				request.setAttribute("Nome", confirmacaoPedido.getNome());
				request.setAttribute("endereco", confirmacaoPedido.getEndereco());
				request.setAttribute("Email", confirmacaoPedido.getEmail());
				request.setAttribute("BrRoboticsCodigo", confirmacaoPedido.getBrRoboticsCodigo());
				request.setAttribute("StarkSystemCodigo", confirmacaoPedido.getStarkSystemCodigo());
				request.setAttribute("TotalStark", confirmacaoPedido.getTotalStark());
				request.setAttribute("TotalBrRobotics", confirmacaoPedido.getTotalBrRobotics());
				request.setAttribute("TransacaoCard", confirmacaoPedido.getTransacaoCard());
				request.setAttribute("Bandeira", confirmacaoPedido.getBandeira());
				request.setAttribute("ValorTotalCompra", confirmacaoPedido.getValorTotalCompra());

				RequestDispatcher rd = request.getRequestDispatcher("/resultadoPedido.jsp");
				rd.forward(request, response);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new javax.servlet.ServletException();
		}
	}

	@SuppressWarnings("unused")
	private int toInt(String s) {
		try {
			return Integer.valueOf(s);
		} catch (NumberFormatException e) {
			return 0;
		}

	}

}
