<html>
<body>

	<br>
	This is two.jsp
	<br>

	<%
 		String name = (String)pageContext.getAttribute("uid");
	%>
	<%= name %>

	

</body>
</html>
