<%@page import="controller.TodoCtrl"%>
<%
	if(request.getParameter("idTodo") != null){
		int id = Integer.parseInt(request.getParameter("idTodo"));
		TodoCtrl.completeTodo(id);
	}

	response.sendRedirect("index.jsp");





%>