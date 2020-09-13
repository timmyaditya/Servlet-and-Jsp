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

		Cookie arr[] = request.getCookies();

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].equals("uname"))
			{
				out.println("<h1>Hello "+arr[i]+"</h1><br>");
			}		
			else
			{
				out.println("<h3>Your password is "+arr[i]+"</h3><br>");
			}		
		}			
		out.println("<h4>This page is for female<h4>");		

		out.println("</body>");
		out.println("</html>");
	}
}
