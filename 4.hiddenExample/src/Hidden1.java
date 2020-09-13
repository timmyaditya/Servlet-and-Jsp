import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class Hidden1 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
		response.setContentType("text/html");		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		out.println("<form action='hidden2'>");
		out.println("<input type='text' name='uname1'>");
		out.println("<input type='submit'>Click here</input>");	
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");
	}
}
