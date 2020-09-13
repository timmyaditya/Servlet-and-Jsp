import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;

public class Male extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");

		HttpSession session = request.getSession();

		String uname = (String) session.getAttribute("uname");
		String pw = (String) session.getAttribute("pw");

		out.println("<h1>Hello "+uname+"</h1><br>");
		out.println("<h3>Your password is "+pw+"</h3><br>");
		out.println("<h4>This page is for male<h4>");		

		out.println("</body>");
		out.println("</html>");
	}
}
