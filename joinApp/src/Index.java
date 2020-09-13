import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Index extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		int totalCustomers=getTotalCountFromDatabase();
		PrintWriter out = response.getWriter();
		response.setContentType("text.html");
		out.println("<html>");
		out.println("<body>");
		
		out.println("Till now we are a total of "+ totalCustomers+ "do you wanna join and feel the love of computers");
		out.println("<form action=info>");
		out.println("Click here to joinUs <input type='submit'></input>");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");
	}
	int getTotalCountFromDatabase()
	{
		int total=0;
		try{
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joinUsDB", "root", "");
			String query = "SELECT COUNT(*) AS cnt FROM customers";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
					total=rs.getInt("cnt");
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
