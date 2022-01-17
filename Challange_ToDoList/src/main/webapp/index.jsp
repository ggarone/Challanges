<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@ include file="todo.jsp" %>

<!--  qui inserisco il contenuto dinamico -->

<%-- <% if(request.getParameter("action") != null) { %>
	<% if(request.getParameter("action").equals("addLibro")) { %>
	<%@ include file="form_libro.jsp" %>
	<%} %>
	<% if(request.getParameter("action").equals("listLibri")) { %>
	<%@ include file="list_libri.jsp" %>
	<%} %>
<% } else { %>
	<%@ include file="homepage.html" %>
<% } %> --%>

<% if(request.getParameter("action") != null) { 
		if(request.getParameter("action").equals("completa")) { %>
			<%@ include file="completa.jsp" %>
		<%} %>
	<%} %>


<%@ include file="footer.jsp" %>