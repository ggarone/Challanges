<%@page import="model.Acquisto"%>
<%@page import="model.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Negozio</title>
</head>
<body>
    <h1>Negozio</h1>
	<form method="post" action="negozio">
        <input type="month" name="negozio" id="negozio">
        <input type="submit" value=Compute>
    </form>
    
	<table>
	
		<tr>
			<th>Nome Cliente</th>
			<th>Prezzo</th>
			<th>Data</th>
		</tr>
	<%	List<Cliente> clienti = (List<Cliente>) request.getAttribute("clienti"); %>
	<%for(Cliente c: clienti){%>
		<%for(Acquisto a: c.getAcquisti()) {%>
			<tr>
				<td><a href="?cliente=<%=c.getId()%>"><%=c.getNome()%></a></td>
				<td><a href="?prodotto=<%=a.getProdotto().getId()%>"><%=a.getProdotto().getNome()%></a></td>
				<td><%=a.getProdotto().getPrezzo()%></td>
				<td><%=a.getData()%></td>
			</tr>
		<% }%>
	<% }%>
	</table>
</body>
</html>