import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class Table2 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<body>");

	int num1 = Integer.parseInt(request.getParameter("fno"));
	int num2 = Integer.parseInt(request.getParameter("sno"));

	int cnt=1;

	out.println("<table border='1px'>");
	for(int j=1 ; j<=10 ; j++)
	{
		out.println("<tr>");
		for(int i=num1 ; i<=num2 ; i++)	
		{
			out.println("<td>" + i*j + "</td>");
		}
		out.println("</tr>");
		out.println("<br>");
	}
	out.println("</table>");
	out.println("</body>");
	out.println("</html>");
}
}
