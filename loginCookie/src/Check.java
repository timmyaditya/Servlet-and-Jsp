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

		String uname = request.getParameter("username");
		String pw = request.getParameter("password");

		Cookie cookie1 = new Cookie("uname", uname);
		Cookie cookie2 = new Cookie("pw", pw);

		response.addCookie(cookie1);
		response.addCookie(cookie2);			


		String choice = request.getParameter("choice");

		if(choice.equals("male"))
		{
			response.sendRedirect("male");
		}
		else
		{
			response.sendRedirect("female");
		}

		out.println("</body>");
		out.println("</html>");	
	}
}
