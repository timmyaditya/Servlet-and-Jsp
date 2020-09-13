import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class Hidden3 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
		response.setContentType("text/html");		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		int uname2 = Integer.parseInt(request.getParameter("uname2"));

		out.println("<h1>Welcome "+ uname2 + "</h1>");

		out.println("</body>");
		out.println("</html>");
	}
}
