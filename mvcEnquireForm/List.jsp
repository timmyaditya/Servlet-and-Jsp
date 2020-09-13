<html>
<body>
	<%@ page import="mypackage.Enquire" %>
	<%@ page import="java.sql.ResultSet" %>
	This is MYJSP.jsp<br>
	The follwing are the total enquire and their info present in the database
	<br>
	<br>	
	<br>
	<br>	
	<br>
	<br>	
	<br>
	<br>	
	<a href=controller?oper=add>Add New Student</a>
	<%
		
		ResultSet rs= (ResultSet)request.getAttribute("rs");
	
	%>
	<table border = 1px>
		<thead>
			<tr>
				<th>Enquire no</th>
				<th>Enquire Date</th>
				<th>Student Name</th>
				<th>Course Name</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
	<%
		while(rs.next())
		{
	%>
		<tr>
			<td><%=rs.getInt("enquireNo")%></td>
			<td><%=rs.getString("enquireDate")%></td>
			<td><%=rs.getString("studName")%></td>
			<td><%=rs.getString("courseName")%></td>
			<td><a href=controller?oper=update&enquireNo=<%=rs.getInt("enquireNo")%>>Update</td>
			<td><a href=controller?oper=delete&enquireNo=<%=rs.getInt("enquireNo")%>>Delete</td>
		</tr>
	<%		
		}
	%>
	</table>
</body>
</html>
