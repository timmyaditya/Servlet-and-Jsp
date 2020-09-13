import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class DatabaseInsert extends HttpServlet
{
    String fname,lname,email;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
	    PrintWriter out = response.getWriter();
		response.setContentType("text.html");
		fname = (String) request.getParameter("fname");
		lname = (String) request.getParameter("lname");
		email = (String) request.getParameter("email");
		insertIntoDB();
		response.sendRedirect("joined");
		out.println("<html>");
		out.println("<body>");
	}

	void insertIntoDB()
	{
		try
 		{
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joinUsDB", "root", "");
			String query = "INSERT INTO customers(fname, lname, email) VALUES("+fname+","+lname+","+email+")";
			Statement stmt = con.createStatement();
		    stmt.executeUpdate(query);
			stmt.close();
		    con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}
