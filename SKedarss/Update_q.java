package SKedarss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update_q {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1;
		String roll;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Name1");
		name1=sc.nextLine();
		System.out.println("Enter Roll number");
		roll=sc.nextLine();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SwamiKedar","root","root");
			
			Statement stmt=con.createStatement();
			
			
			String query1="update students set name='"+name1+"'where rollno="+roll+"";
			
			stmt.executeUpdate(query1);
			System.out.println(" Record Updated ");
		}
		catch(Exception e) {
			System.out.println("Error"+e.toString());
		}
	}

}
