import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class Hidden2 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
		response.setContentType("text/html");		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		int uname1 = Integer.parseInt(request.getParameter("uname1"));

		out.println("<form action='hidden3'>");
		out.println("Good Morning<br>");
		out.println("<h1>WElCOME Dear "+uname1+"</h1>");
		out.println("<input type='hidden' name='uname2' value=" + uname1 + ">");
		out.println("<input type='submit' name='submit'></input>");	
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");
	}
}
