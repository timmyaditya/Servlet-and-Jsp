<html>
<body>
	<%
		int a = Integer.parseInt(request.getParameter("fno"));
		int b = Integer.parseInt(request.getParameter("sno"));
	%>
<table border=1px>
	<%
		for(int i=1 ; i<=10; i++)
		{
	%>

	<tr>

		<%
				for(int j=a; j<=b; j++)
				{
					int c = j*i;
		%>

			<td>
				<%
					out.println(c);
				%>
			</td>

		<%
				}
		%>

	</tr>

	<%
		}
	%>

</table>

</body>
</html>
