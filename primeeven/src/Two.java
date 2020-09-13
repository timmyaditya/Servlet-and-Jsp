import javax.servlet.http.*;
import java.io.*;
import javax.servlet.ServletException;

public class Two extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");

		int num = Integer.parseInt(request.getParameter("number"));
		String choice = request.getParameter("choice");
		if(choice.equals("prime"))
		{
			int flag=0;
			for(int i=2 ; i<num/2 ; i++)
			{
				if(num%i==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				out.println("<h1>The Given Number <b>Is Prime</b></h1>");
			}
			else{out.println("<h1>The Given Number Is <b>Not Prime</b></h1>");}	
		}
		else if(choice.equals("evenodd"))
		{
			if(num%2==0)
			{
				out.println("<h1>The Given Number <b>Is Even</b></h1>");
			}
			else{out.println("<h1>The Given Number <b>Is Odd</b></h1>");}
		}
		else
		{
			out.println("Choose a valid radio button option");
		}

		out.println("</body>");
		out.println("</html>");
	}
}

