import javax.servlet.http.*;
import java.io.*;
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("cpc java patil aditya");
 		out.println("</body>");
		out.println("</html>");
	}
}
