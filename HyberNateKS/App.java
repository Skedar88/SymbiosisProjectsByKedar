 package HyberNateKS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Configuration config = new Configuration();
	        config.configure();

	        // local SessionFactory bean created
	        SessionFactory sessionFactory = config.buildSessionFactory();

	        Session session = sessionFactory.openSession();
	        
//	        Session opened
	        Transaction tx = session.beginTransaction();
	        
//          Transaction begin
	        Student1 s2 = new Student1();
	        s2.setRollno(59);
	        s2.setName("Sneha");
	        
	        s2.setAddress("Gaudgaon");

	        // session.save(s1);
	        session.persist(s2);

//	        session.getTransaction().commit();
	        tx.commit();
	        session.close();

		
	}

}
