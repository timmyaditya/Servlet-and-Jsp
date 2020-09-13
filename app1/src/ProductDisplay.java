import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ProductDisplay extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		try
		{		
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "");
			String query="SELECT productName AS prName FROM productInfo";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				out.println("<a href=productinfo?prName="+rs.getString("prName")+">"+rs.getString("prName")+"</a><br>");
			}
			 rs.close();
		     stmt.close();
		     con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		out.println("</body>");
		out.println("</html>");
	}
}
