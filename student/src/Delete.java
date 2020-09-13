import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Delete extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		int id = Integer.parseInt(request.getParameter("id"));
		try
		{
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "");
			String query = "DELETE FROM stud_profile WHERE id="+id;		
			Statement stmt = con.createStatement(); 
			stmt.executeUpdate(query);
			out.println("Student Deleted successfully");
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
