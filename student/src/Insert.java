import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Insert extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		String fullName = (String) request.getParameter("fullName");
		int age = Integer.parseInt(request.getParameter("age"));
		try
		{
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "");
			String query = "INSERT INTO stud_profile(fullName, age) VALUES('"+fullName+"', '"+age+"')";		
			Statement stmt = con.createStatement(); 
			stmt.executeUpdate(query);
			out.println("Student inserted successfully");
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
			response.sendRedirect("list");
		out.println("</body");
		out.println("</html>");
		
	}
}	
