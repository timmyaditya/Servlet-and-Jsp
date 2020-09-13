import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class Cart extends HttpServlet
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		
		HttpSession session = request.getSession();
		Vector v = (Vector) session.getAttribute("vec");
		

		out.println("<table border='1px'>");
		out.println("<tr>");
			out.println("<td>Product Name</td>");
			out.println("<td>Product Price</td>");
			out.println("<td>Qty</td>");
			out.println("<td>Total</td>");
		out.println("</tr>");


		for(int i=0; i<v.size() ; i++)
		{
			String name=(String) v.get(i);
			ProductInfo pf = (ProductInfo) session.getAttribute('"'+name+'"');
			out.println("<tr>");
				out.println("<td>"+pf.prname+"</td>");
				out.println("<td>"+pf.prprice+"</td>");
				out.println("<td>"+pf.prqty+"</td>");
				out.println("<td>"+pf.prprice*pf.prqty+"</td>");
			out.println("</tr>");
		}
	
		out.println("</table>");

		out.println("<a href='addproduct'>click here to add more products</a>");

		out.println("</body>");
		out.println("</html>");
	}
}


