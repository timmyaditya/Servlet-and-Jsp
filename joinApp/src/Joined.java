import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Joined extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		int totalCustomers=getTotalCountFromDatabase();
		PrintWriter out = response.getWriter();
		response.setContentType("text.html");
		out.println("<html>");
		out.println("<body>");
		
		out.println("You have successfully joined "+ totalCustomers+ " others and now you will really get a feel of all the love from computers");
		out.println("</body>");
		out.println("</html>");
	}
	int getTotalCountFromDatabase()
	{
		int total=0;
		try{
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joinUsDB", "root", "");
			String query = "SELECT COUNT(*) AS total FROM customers";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
					total=rs.getInt("total");
			}
			rs.close();
			stmt.close();
			con.close();
			return total;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return total;
	}
}
