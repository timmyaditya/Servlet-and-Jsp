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
		String prname = request.getParameter("prname");
		int prprice = Integer.parseInt(request.getParameter("prprice"));
		int prqty = Integer.parseInt(request.getParameter("prqty"));
		
		ProductInfo p = new ProductInfo(prname, prprice, prqty);	
		session.setAttribute(prname, p);

		int total=0;
		out.println("<table border='1px'>");
		out.println("<tr>");
			out.println("<td>Product Name</td>");
			out.println("<td>Product Price</td>");
			out.println("<td>Qty</td>");
			out.println("<td>Total</td>");
		out.println("</tr>");

//Enumeration<String> attributes = request.getSession().getAttributeNames();
//while (attributes.hasMoreElements()) {
 //   String attribute = (String) attributes.nextElement();
  //  System.out.println(attribute+" : "+request.getSession().getAttribute(attribute));
//}

	Enumeration<String> attributes = session.getAttributeNames();
		while(attributes.hasMoreElements())
		{
			out.println("<tr>");
			ProductInfo pf = (ProductInfo) session.getAttribute((String) attributes.nextElement());
			out.println("<td>"+pf.prname+"</td>");
			out.println("<td>"+pf.prprice+"</td>");
			out.println("<td>"+pf.prqty+"</td>");
			out.println("<td>"+pf.prprice*pf.prqty+"</td>");
			total=total+(pf.prprice*pf.prqty);
		out.println("</tr>");
		}
		out.println("<tr>");
		out.println("<th colspan='4'>Grand total = "+total+"</th>");
		out.println("</tr>");

		out.println("</table>");

		out.println("<a href='addproduct'>click here to add more products</a>");

		out.println("</body>");
		out.println("</html>");
	}
}
class ProductInfo
{
	String prname;
	int prprice, prqty;
	ProductInfo(String prname, int prprice, int prqty)
	{
		this.prname = prname;
		this.prprice = prprice;
		this.prqty = prqty;
	}
}

