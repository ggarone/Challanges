<%@page import="model.Todo"%>
<%@page import="controller.TodoCtrl"%>

<h1>ITEMS</h1>
<form method="POST" action="addToDo.jsp">
	<input type="text" name="item" id="item" placeholder="item">
	<input type="submit" value="aggiungi">

</form>

<table class="table">
<tr>
	<th><h2>Elenco Item:</h2></th>
</tr>
<tr>
<% 	for(Todo t : TodoCtrl.getLista()){ %>
	<% if(t.isCompleted()) { %>
		<td><input type="checkbox" onchange="completa(<%=t.getId()%>)" name="item" id="item" checked><%=t.getDescription()%></td>
	<% } else { %>
		<td><input type="checkbox" onchange="completa(<%=t.getId()%>)" name="item" id="item"><%=t.getDescription()%></td>
	<%} %>
</tr>


<% }%>
</table>
<br>
<form class="button" method="POST" action="daCompletare.jsp">
	<input type="submit" value="vedi solo da completare">
</form>
<br>
<form class="button" method="POST" action="completati.jsp">
	<input type="submit" value="vedi solo completati">
</form>

<script>
	function completa(params) {
		location.href= "index.jsp?action=completa&idTodo=" + params;
		//alert(params);
	}
</script>