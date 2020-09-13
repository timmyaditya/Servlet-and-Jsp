import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class List extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
			out.println("<link rel='stylesheet' href='./css/style.css'>");
			out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' integrity='sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm' crossorigin='anonymous'>");
		out.println("</head>");
		out.println("<body>");
		


		try
		{
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "");
			String query = "SELECT * FROM stud_profile";		
			Statement stmt = con.createStatement(); 
			ResultSet rs=stmt.executeQuery(query);
			out.println("<table class='table'>");
			out.println("<thead class='thead-dark'>");
			  out.println("<tr>");
				out.println("<th scope='col'>ID</th>");
				out.println("<th scope='col'>FULLNAME</th>");
				out.println("<th scope='col'>AGE</th>");
				out.println("<th scope='col'>UPDATE</th>");
				out.println("<th scope='col'>DELETE</th>");
			  out.println("</tr>");
			out.println("</thead>");
			out.println("<tbody>");
			while(rs.next())
			  {
			  out.println("<tr>");
				out.println("<th scope='row'>"+rs.getInt("id")+"</th>");
				out.println("<td>"+rs.getString("fullName")+"</td>");
				out.println("<td>"+rs.getInt("age")+"</td>");
				out.println("<td><a href='update?id="+rs.getInt("id")+"'>Update</a></td>");
				out.println("<td><a href='delete?id="+rs.getInt("id")+"'>Delete</a></td>");
			  out.println("</tr>");
			  }
		  
			 rs.close();
			 stmt.close();
			 con.close();
		}
		catch(Exception e)
	    {
		  System.out.println(e);	
	    }	  	  
	out.println("</tbody>");
	 out.println("</table>");
	 out.println("<hr>");
	 out.println("<div class='links d-flex justify-content-center align-items-center'>");
	 	out.println("<a href='add' class='badge badge-success'>Add A New Student</a>");
	 out.println("</div>");	
	 out.println("</body");
		out.println("</html>");

		out.println("<script src='https://code.jquery.com/jquery-3.2.1.slim.min.js' integrity='sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN' crossorigin='anonymous'></script>");
		out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js' integrity='sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q' crossorigin='anonymous'></script>");
		out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js' integrity='sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl' crossorigin='anonymous'></script>");
		
	}
}	
