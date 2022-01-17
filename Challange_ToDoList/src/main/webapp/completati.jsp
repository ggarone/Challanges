<%@page import="model.Todo"%>
<%@page import="controller.TodoCtrl"%>

<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>

<table>
<tr>
	<th><h2>Elenco Item:</h2></th>
</tr>
<tr>
<% 	for(Todo t : TodoCtrl.getLista()){ %>
	<% if(t.isCompleted()) { %>
		<td><input type="checkbox" name="item" id="item" checked><%=t.getDescription()%></td>
	<%} %>
</tr>


<% }%>
</table>