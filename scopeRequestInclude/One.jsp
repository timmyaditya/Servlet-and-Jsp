<html>
<body>
	<br>
	Before include
	<br>


	<%
		request.setAttribute("uid", "aditya");
	%>



	<br>
	<jsp:include page="Two.jsp" />
	<br>


	<br>
	After include
	<br>


	<br>
	<%
 		String name = (String)request.getAttribute("uid");
	%>
	<%= name %>
	<br>


</body>
</html>
