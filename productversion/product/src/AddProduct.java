import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AddProduct extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");

		out.println("<form action=check>");
		out.println("Product Name:<input type='text' name='prname' required placeholder='Enter product Name'></input>");
		out.println("Product Price:<input type='text' name='prprice' required placeholder='Enter product Price'></input>");
		out.println("Oty:<input type='text' name='prqty' required placeholder='Enter product quantity'></input>");
		out.println("<input type='submit'></input>");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");
	}
}
