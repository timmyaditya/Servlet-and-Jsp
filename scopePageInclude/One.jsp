<html>
<body>
	<br>
	Before include
	<br>


	<%
		pageContext.setAttribute("uid", "aditya");
	%>



	<br>
	<jsp:include page="Two.jsp" />
	<br>


	<br>
	After include
	<br>


	<br>
	<%
 		String name = (String)pageContext.getAttribute("uid");
	%>
	<%= name %>
	<br>


</body>
</html>
