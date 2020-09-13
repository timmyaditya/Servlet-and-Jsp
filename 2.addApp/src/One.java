import javax.servlet.http.*;
import java.io.*;

public class One extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<form action='Two'>");
	out.println("Enter first number: ");
	out.println("<input type='text' name='fno'></input>");
	out.println("<Enter the second number : >");
	out.println("<input type='text' name='sno'></input>");
	out.println("<input type='submit' name='submit'></input>");
	out.println("</form>");
	out.println("</body>");
	out.println("</html>");
}
}
