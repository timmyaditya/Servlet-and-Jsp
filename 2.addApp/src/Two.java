import javax.servlet.http.*;
import java.io.*;

public class Two extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
{
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<body>");
    int num1=Integer.parseInt(request.getParameter("fno"));
    int num2=Integer.parseInt(request.getParameter("sno"));
    int sum=num1 + num2;
    out.println("<center><font color='blue' size='15'>");
    out.println("Sum=" + sum);
    out.println("</font></center>"); 
    out.println("</body>");
    out.println("</html>");
}
}
