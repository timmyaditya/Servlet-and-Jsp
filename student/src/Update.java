import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Update extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
		// out.println("Student ID <input type='text' name='id' value="+id+"></input>");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
			out.println("<link rel='stylesheet' href='./css/style.css'>");
			out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' integrity='sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm' crossorigin='anonymous'>");
		out.println("</head>");
		out.println("<body>");
		int id = Integer.parseInt(request.getParameter("id"));
		out.println("<div class='container'>");
			out.println("<form action='edit'>");

			out.println("<div class='form-group'>");
			out.println("<label for='studentId'>Student ID</label>");
			out.println("<input type='text' name='id' class='form-control' id='studentId' value="+id+">");
			out.println("</div>");

			out.println("<div class='form-group'>");
			out.println("<label for='studentName'>Name of the student</label>");
			out.println("<input type='text' name='fullName' class='form-control' id='studentName' aria-describedby='textHelp' placeholder='Enter full name of student'>");
			out.println("<small id='textHelp' class='form-text text-muted'>Please Enter your Students Full name</small>");
			out.println("</div>");
			
			out.println("<div class='form-group'>");
			out.println("<label for='studentAge'>Age of the student</label>");
			out.println("<input type='number' name='age' class='form-control' id='studentAge' placeholder='Age of the student'>");
			out.println("</div>");
			
			out.println("<button type='submit' class='btn btn-primary'>Submit</button>");
		out.println("</form>");	
	out.println("</div>");
		out.println("</body");
		out.println("</html>");
		
	}
}	
