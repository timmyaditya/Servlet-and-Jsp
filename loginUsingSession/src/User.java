import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;

public class User extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		out.println("<form action='check'>");
		out.println("Enter username:  <input type='text' name='username' required></input>");
		out.println("Enter Password:  <input type='password' name='password' required></input>");
		out.println("<input type='radio' name='choice' value='male'>Male</input>");
		out.println("<input type='radio' name='choice' value='female'>Female</input>");
		out.println("<input type='submit'></input>");
		out.println("</form>");	

		out.println("</body>");
		out.println("</html>");
	}
}
