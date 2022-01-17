<%@page import="model.Todo"%>
<%@page import="controller.TodoCtrl"%>

<table>
<tr>
	<th><h2>Elenco Item:</h2></th>
</tr>
<tr>
<% 	for(Todo t : TodoCtrl.getLista()){ %>
	<% if(t.isCompleted()) { %>
		<th><input type="checkbox" name="item" id="item" checked><%=t.getDescription()%></th>
	<%} %>
</tr>


<% }%>
</table>