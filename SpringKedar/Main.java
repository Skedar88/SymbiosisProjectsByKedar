package SpringKedar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args) {
		   


		
				ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
				
				Doctor doctor=context.getBean(Doctor.class);
				
				//Doctor doctor=(Doctor)context.getBean("doctor");
				
				
				Nurse nurse=context.getBean(Nurse.class);
						doctor.assist();
						nurse.assist1();


		
		
	}

}
