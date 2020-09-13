import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;

public class Check extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");

		String choice = request.getParameter("choice");
		String uname = request.getParameter("username");
		String pw = request.getParameter("password");
		if(choice.equals("male"))
		{
			response.sendRedirect("male?uname="+uname+"&pw="+pw);
		}
		else
		{
			response.sendRedirect("female?uname="+uname+"&pw="+pw);
		}

		out.println("</body>");
		out.println("</html>");	
	}
}
