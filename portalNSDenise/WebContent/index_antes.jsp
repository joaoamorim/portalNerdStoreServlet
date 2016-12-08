<!DOCTYPE html>
<html>
<head>
<title>NerdStore</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="resource/estilo.css" />
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
</head>
<body>
	<% int count = 0; %>
	<h1>NerdStore - Venda de brinquedos para nerds</h1>
	<hr>
	<p>
		Esta é a Nerdstore. A loja melhor amiga dos nerds... :-)
		
		<br /><br />
		<strong>Por favor, faça seu pedido:</strong>

	</p>
	<form action="processarPedido" method="post">
		<!--           <form action="compra.html" method="post"> -->
		1- <img src="images/domestico.jpeg" width="50" height="50"
			alt="domestico" /> Robo Domestico -
		Quantidade:<input type="number" name="Robô Domestico" value="1" min="0" size="2" width="20" ><br>

		2-<img src="images/medico.jpeg" width="50" height="50"
			alt="medico" /> Robo Médico -
		Quantidade:<input type="number" name="Robô Médico" value="1" min="0" size="2" width="30"><br>
		
		3- <img src="images/seguranca.jpeg" width="50" height="50"
			alt="seguranca" />  Robo Segurança -
		Quantidade:<input type="number" name="Robô Segurança" value="1" min="0" size="2" width="50"><br>
		
		<hr>
		
		4- <img src="images/ReatorArc.png" width="50"
			height="50" alt="arc" /> Reator Ark -
		Quantidade:<input type="number" name="Reator Ark" value="1" min="0" size="2"><br>
		
		5- <img src="images/reatorSolar.jpeg" width="50"
			height="50" alt="arc" /> Reator Solar -
		Quantidade: <input type="number" name="Reator Solar" value="1" min="0" size="2"> 
		<br><br>

		<hr>
		<br> <strong>Informe seus dados para efetuar a compra e para a entrega</strong><br>
		<table>
			<tr>
				<td class="tableColumnTitle">Nome:</td>
				<td><input type="text" name="Nome" size="50" maxlength="200" value="Teste teste"></td>
			</tr>
			<tr>
				<td class="tableColumnTitle">E-mail:</td>
				<td><input type="email" name="E-mail" size="35" maxlength="100" value="teste@teste.com"></td>
			</tr>
			<tr>
				<td class="tableColumnTitle">CEP:</td>
				<td><input type="text" name="CEP" size="9" value="88101090"></td>
			</tr>
			<tr>
				<td class="tableColumnTitle">Número do Cartão:</td>
				<td><input type="text" name="Número do cartão" size="30" value="4914824356781234"></td>
			</tr>
			<tr>
				<td class="tableColumnTitle">Vencimento do Cartão:</td>
				<td><input type="month" name="Data de vencimento do cartão" size="10" value="2017-09" ></td>
			</tr>
		</table>

		<hr>
		<input type="submit" value="Realizar Pedido"> <input
			type="reset" value="Cancel">
	</form>

</body>
</html>
