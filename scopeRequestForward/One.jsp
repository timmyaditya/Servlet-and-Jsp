<html>
<body>

Before forward!!
<br>

<%
        request.setAttribute("uid", "Sachin");
%>

<jsp:forward page="Two.jsp"  /> 

<br>
After forward!!

</body>
</html>