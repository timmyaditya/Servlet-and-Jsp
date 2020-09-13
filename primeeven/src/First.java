import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;

public class First extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("body");
		out.println("<form action='two'>");
		out.println("Enter No. <input type='text' name='number' required></input>");
		out.println("<input type='radio' name='choice' value='prime'>check for prime/not prime</input>");
		out.println("<input type='radio' name='choice' value='evenodd'>check for even/odd</input>");
		out.println("<input type='submit'></input>");
		out.println("</form>");	
		out.println("</body>");
		out.println("</html>");
	}
}
