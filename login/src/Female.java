import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;

public class Female extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");

		String uname = request.getParameter("uname");
		String pw = request.getParameter("pw");
		out.println("<h1>Hello "+uname+"</h1><br>");
		out.println("<h3>Your password is "+pw+"</h3><br>");
		out.println("<h4>This page is for female<h4>");		

		out.println("</body>");
		out.println("</html>");
	}
}
