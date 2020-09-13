<html>
<body>

	<br>
	This is two.jsp
	<br>

	<%
 		String name = (String)request.getAttribute("uid");
	%>
	<%= name %>

	

</body>
</html>
