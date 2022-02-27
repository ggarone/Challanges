<%@page import="model.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prodotti</title>
</head>
<body>
	<h1>Prodotti</h1>
	<table>
		<tr>
			<th>Nome</th>
			<th>Prezzo</th>
		</tr>
	<%	List<Prodotto> prodotti = (List<Prodotto>) request.getAttribute("prodotti"); %>
	<%for(Prodotto p: prodotti){%>
		<tr>
			<td><%=p.getNome()%></td>
			<td><%=p.getPrezzo()%></td>
		</tr>
	<% }%>
	</table>

</body>
</html>