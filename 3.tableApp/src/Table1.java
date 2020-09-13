import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class Table1 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<form action='tabletwo'>");
	out.println("Enter the First Number : ");
	out.println("<input type='text' name='fno'></input>");
	out.println("Enter the second Number : ");
	out.println("<input type='text' name='sno'></input>");
	out.println("<input type='submit' name='submit'></input>");
	out.println("</form>");
	out.println("</body>");
	out.println("</html>");
}
}
