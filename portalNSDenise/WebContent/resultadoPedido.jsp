<%@page import="java.util.Arrays"%>
<%@page import="java.util.Enumeration, java.util.Map, java.util.HashMap, java.util.List"%>
<html>
<head>
    <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="resources/estilo.css" />
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>

<% 
/*
Map<String, String[]> parameters = request.getParameterMap(); 
	  System.out.println("Map: " + parameters.size());
	  for(String p : parameters.keySet()) {
		  System.out.println("p: " + parameters.get(p));
		  List<String> mlista = Arrays.asList(parameters.get(p));
		  int c = 1;
		  for(String s : mlista){
			  System.out.println("s " + c + ": " + s);
			  c++;
		  }
		  
		  System.out.println("termino for");
	  }
	  */
	%>

	<h3 id="heading-1" class="ui-bar ui-bar-b ui-corner-all">NerdStore</h3>
	<div class="ui-body ui-body-a ui-corner-all">
	
	
		<h3>Informações do pedido</h3>
		<table id="table-info">
		<thead>
			<tr>
				<th>Produto</th>
				<th>Valor</th>
			</tr>
		</thead>
		<tbody>
		<%
		/*
			String[] itens = {"Nome: ","E-mail: ","CEP: ","Número do cartão: ","Data de vencimento do cartão: ","Robô doméstico: ","Robô segurança: ","Robô médico: ","Reator ark: ","Reator solar: "};
			String[] valores = new String[10];
			String PARAMETER;
			int i=0;			
			
			//Map<String, String[]> 
			parameters = request.getParameterMap();
			for(String parameter : parameters.keySet()) {
				PARAMETER=parameter.toUpperCase();
				if(PARAMETER=="NOME")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="EMAIL")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="CEP")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="CARTAO")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="CARTAOVENC")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="QTDROBODOMESTICO")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="QTDROBOSEGURANCA")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="QTDROBOMEDICO")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="QTDREATORARK")
					valores[i++]=request.getParameter(PARAMETER);
				else if(PARAMETER=="QTDREATORSOLAR")
					valores[i++]=request.getParameter(PARAMETER);
			}
			
			for(i=0;i<itens.length;i++){
				*/
				
				Map<String, String[]>parameters = request.getParameterMap();
				for(String parameter : parameters.keySet()) {
					%>
					<tr>
							<td><%= //itens[i] 
									 parameter.toUpperCase() %></td>
							<td><%= //valores[i]
									request.getParameter(parameter) %></td>
						</tr>
					<%    
				}		
		 
		%>
			
		</tbody>
	</table>
	
	<br /><br />
	
	<h3>Resultado do Processamento do Pedido</h3>
		<table id="table-info">
		<thead>
			<tr>
				<th>Info</th>
				<th>Valor</th>
			</tr>
		</thead>
		<tbody>
		<%
		
				
				Enumeration<String> requestAttributes = request.getAttributeNames();
				String nextAttribute = null;
				while(requestAttributes.hasMoreElements()){
					nextAttribute = requestAttributes.nextElement();
					System.out.println("Atributo: " + nextAttribute);
					// Print only "user's" parameters
					if(!nextAttribute.toLowerCase().startsWith("javax.servlet")){
						System.out.println(nextAttribute.toUpperCase() + " : " + request.getAttribute(nextAttribute) + "<br />");
						%>
						<tr>
							<td><%= //itens[i] 
									nextAttribute.toUpperCase() %></td>
							<td><%= //valores[i]
									request.getAttribute(nextAttribute) %></td>
						</tr>
					<%   
					}
				}
		 
		%>
			
		</tbody>
	</table>
	</div>
<div>

<%

/*
Enumeration<String> requestAttributes = request.getAttributeNames();
String nextAttribute = null;
while(requestAttributes.hasMoreElements()){
	nextAttribute = requestAttributes.nextElement();
	System.out.println("Atributo: " + nextAttribute);
	// Print only "user's" parameters
	if(!nextAttribute.toLowerCase().startsWith("javax.servlet")){
		out.println(nextAttribute.toUpperCase() + " : " + request.getAttribute(nextAttribute) + "<br />");
	}
}
*/
%>

<!-- 
Codigo do pedido: < %= request.getAttribute("orderId") %>
<br />
Endereco de entrega: < %= request.getAttribute("clientAddress") %>
<br />
Valor total: < %= request.getAttribute("valorTotal") %>
<br />
-->
<br /><br />
Obrigado por comprar na Nedstore.
<br /><br />
Volte sempre!

<a href="index.html" id="button-1" class="ui-btn ui-corner-all">Voltar</a>
<br />

</body></html>