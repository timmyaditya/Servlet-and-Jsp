import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ProductInfo extends HttpServlet
{	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		
		String prName = (String) request.getParameter("prName");
		try
		{		
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "");
			String query="SELECT * FROM productInfo WHERE productName='"+prName+"'";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				out.println("Name: "+ rs.getInt("id") +"<br>");
				out.println("Product Name: "+ rs.getString("productName") +"<br>");
				out.println("Product Price: "+ rs.getInt("price") +"<br>");
				out.println("Product Material: "+ rs.getString("material") +"<br>");
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

