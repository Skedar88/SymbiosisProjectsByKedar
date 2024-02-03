package SKedarss;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;

public class Insert_Data {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			
			
			String rollno;
			String name;
			String age;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter user Roll NO");
			rollno=sc.nextLine();
			
			
			System.out.println("Enter user Name");
			name=sc.nextLine();
			
			System.out.println("Enter user Age");
			age=sc.nextLine();
			
			
			

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SwamiKedar","root","root");
				
				Statement stmt=con.createStatement();
				
				String query="insert into students values('" +rollno+"','"+name+"','"+age+"')";
				
				stmt.executeUpdate(query);
				System.out.println(" Record Saved ");
			}
			catch(Exception e) {
				System.out.println("Error"+e.toString());
			}
		}

	}
