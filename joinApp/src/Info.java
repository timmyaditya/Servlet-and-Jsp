import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class Info extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text.html");

		out.println("<html>");
		out.println("<body>");
		
		out.println("<form action=databaseinsert>");
			out.println("<h1>Great You made it till here fill in the details to stay tunned</h1>");
			out.println("Enter First Name: <input type='text' name='fname'></input>");
			out.println("Enter last Name: <input type='text' name='lname'></input>");
			out.println("Enter eamil id: <input type='email' name='email'></input>");
			out.println("Click here to submit to DB <input type='submit'></input>");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");
	}
}
