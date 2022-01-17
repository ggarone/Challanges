<%@page import="controller.TodoCtrl"%>
<%
	String item = null;
	
	if(request.getParameter("item") != null){
    	item = request.getParameter("item");
	}
	if(item != null)
		TodoCtrl.addTodo(item);
	
	
	response.sendRedirect("index.jsp?action=listItem");
%>
