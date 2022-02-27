<%@page import="model.Acquisto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Acquisti</h1>
	<table>
		<tr>
			<th>Nome Cliente</th>
			<th>Nome Prodotto</th>
			<th>Prezzo</th>
			<th>Data</th>
		</tr>
	<%	List<Acquisto> acquisti = (List<Acquisto>) request.getAttribute("acquisti"); %>
	<%for(Acquisto a: acquisti){%>
		<tr>
			<td><a href="?cliente=<%=a.getCliente().getId()%>"><%=a.getCliente().getNome()%></a></td>
			<td><a href="?prodotto=<%=a.getProdotto().getId()%>"><%=a.getProdotto().getNome()%></a></td>
			<td><%=a.getProdotto().getPrezzo()%></td>
			<td><%=a.getData()%></td>
		</tr>
	<% }%>
	</table>
</body>
</html>