package SKedarss;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SwamiKedar","root","root");
			
			Statement stmt=con.createStatement();
			
			String query="create table if not exists students(rollno int,name varchar(30),age int)";
			
			stmt.executeUpdate(query);
			System.out.println(" Table Created ");
		}
		catch(Exception e) {
			System.out.println("Error"+e.toString());
		}
	}

}
