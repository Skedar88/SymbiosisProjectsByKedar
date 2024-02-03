package HyberNateKS;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student1 {
   
	@Id
	private int rollno;
	private String name;
	private String address;
	
	
	public Student1() {
		super();
	}
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
