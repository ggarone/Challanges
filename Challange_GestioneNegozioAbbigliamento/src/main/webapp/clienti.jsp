<%@page import="model.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clienti</title>
</head>
<body>
	<h1>Clienti</h1>
	<table>
		<tr>
			<th>Nome</th>
			<th>Indirizzo</th>
		</tr>
	<%	List<Cliente> clienti = (List<Cliente>) request.getAttribute("clienti"); %>
	<%for(Cliente c: clienti){%>
		<tr>
			<td><%=c.getNome()%></td>
			<td><%=c.getIndirizzo()%></td>
		</tr>
	<% }%>
	</table>

</body>
</html>