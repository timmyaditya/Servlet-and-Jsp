<html>
<body>


	<%@ page import="java.sql.*"%>

	<%
		ResultSet rs=(ResultSet)request.getAttribute("rs");
	%>

	<%
		if(rs.next())
		{
			int enquireNo=rs.getInt("enquireNo");
			String enquireDate = rs.getString("enquireDate");
			String studName=rs.getString("studName");
			String courseName = rs.getString("courseName");
	%>
	<form action="controller?oper=updateDone">

		<input type="hidden" name="oper" value="updateDone"></input>
		Enquire-No is:- <%=enquireNo%> <input type="hidden" name="enquireNo" value=<%=enquireNo%>><br>
		Enquire Date :- <input type="text" name="enquireDate" value="<%=enquireDate%>"><br>
		Student Name :- <input type="text" name="studName" value="<%=studName%>"><br>		
		Course Name:- <input type="text" name="courseName" value="<%=courseName%>"><br>
		<input type="submit"></input>
	</form>


	<%
		}
	%>

</body>
</html>
