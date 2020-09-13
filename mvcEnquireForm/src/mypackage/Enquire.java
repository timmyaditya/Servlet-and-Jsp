package mypackage;
import java.sql.*;
import javax.sql.*;

public class Enquire
{
	public ResultSet getEnquireList()
	{
		try
			{
				Connection con = null;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enquire", "root", "");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM enquireInfo";
				ResultSet rs = stmt.executeQuery(query);
				return rs;			
			}
			catch(Exception e){}
			return null;
	}


	public void addEnquire(String enquireDate, String studName, String courseName)
	{
		try
			{
				Connection con = null;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enquire", "root", "");
				Statement stmt = con.createStatement();
				String query = "INSERT INTO enquireInfo(enquireDate, studName, courseName) VALUES('"+enquireDate+"', '"+studName+"', '"+courseName+"')";
				stmt.executeUpdate(query);
				stmt.close();
				con.close();
			}
			catch(Exception e){}
			
	}
		
	public ResultSet getEnquireInfoForUpdate(int enquireNo)
	{
		try
			{
				Connection con = null;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enquire", "root", "");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM enquireInfo where enquireNo="+enquireNo;
				ResultSet rs = stmt.executeQuery(query);
				return rs;			
			}
			catch(Exception e){}
			return null;	
	}

	public void updateEnquire(int enquireNo, String enquireDate, String studName, String courseName)
	{
		try
			{
				Connection con = null;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enquire", "root", "");
				Statement stmt = con.createStatement();
				String query = "UPDATE enquireInfo SET enquireDate='"+enquireDate+"', studName='"+studName+"', courseName='"+courseName+"' where enquireNo="+enquireNo;
				stmt.executeUpdate(query);
				stmt.close();
				con.close();
			}
			catch(Exception e){}
	}

	public void deleteEnquire(int enquireNo)
	{
		try
			{
				Connection con = null;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enquire", "root", "");
				Statement stmt = con.createStatement();
				String query = "DELETE FROM enquireInfo where enquireNo="+enquireNo;
				stmt.executeUpdate(query);
				stmt.close();
				con.close();
			}
			catch(Exception e){}
	}
}
