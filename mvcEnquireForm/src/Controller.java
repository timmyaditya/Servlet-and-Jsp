import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import mypackage.Enquire;

public class Controller extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");

		String oper = request.getParameter("oper");
	
		if(oper.equals("list"))
		{		
			Enquire s = new Enquire();
			ResultSet rs = s.getEnquireList();
			
			RequestDispatcher rd = request.getRequestDispatcher("List.jsp");
			request.setAttribute("rs",rs);
			rd.forward(request, response);
		}

		else if(oper.equals("add"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Add.jsp");
			rd.forward(request, response);
		}

		else if(oper.equals("insert"))
		{
			String enquireDate = request.getParameter("enquireDate");
			String studName = request.getParameter("studName");
			String courseName = request.getParameter("courseName");

			Enquire s = new Enquire();
			s.addEnquire(enquireDate, studName, courseName);

			RequestDispatcher rd = request.getRequestDispatcher("controller?oper=list");
			rd.forward(request, response);
		}

		else if(oper.equals("update"))
		{
			int enquireNo = Integer.parseInt(request.getParameter("enquireNo"));
			Enquire s = new Enquire();
			ResultSet rs = s.getEnquireInfoForUpdate(enquireNo);
	
			RequestDispatcher rd = request.getRequestDispatcher("GetUpdatedInfo.jsp");			
			request.setAttribute("rs", rs);
			rd.forward(request, response);
		}

		else if(oper.equals("updateDone"))
		{
			int enquireNo = Integer.parseInt(request.getParameter("enquireNo"));
			String enquireDate = request.getParameter("enquireDate");
			String studName = request.getParameter("studName");
			String courseName = request.getParameter("courseName");
			
			Enquire s = new Enquire();
			s.updateEnquire(enquireNo, enquireDate, studName, courseName);
			
			RequestDispatcher rd = request.getRequestDispatcher("controller?oper=list");
			rd.forward(request, response);
		}

		else if(oper.equals("delete"))
		{
			int enquireNo = Integer.parseInt(request.getParameter("enquireNo"));
			
			Enquire s = new Enquire();
			s.deleteEnquire(enquireNo);
			
			RequestDispatcher rd = request.getRequestDispatcher("controller?oper=list");
			rd.forward(request, response);
		}
	    out.println("</body");
	    out.println("</html>");
	}
}	
