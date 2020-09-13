import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class Check extends HttpServlet
{
	Vector v = new Vector(3,2);
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		HttpSession session = request.getSession();

		String prname = request.getParameter("prname");
		v.add(prname);		
		session.setAttribute("vec", v);

		int prprice = Integer.parseInt(request.getParameter("prprice"));
		int prqty = Integer.parseInt(request.getParameter("prqty"));
		
		ProductInfo p = new ProductInfo(prname, prprice, prqty);	
		session.setAttribute(prname, p);

		response.sendRedirect("cart");
		
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
