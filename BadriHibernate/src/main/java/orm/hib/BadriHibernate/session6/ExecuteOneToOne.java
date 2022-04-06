package orm.hib.BadriHibernate.session6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecuteOneToOne 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
//		Vehicle v=new Vehicle(9478, 2021, 611000, "Ignis");
//		Person p=new Person("Razak Mohamed S", "SAlem", 87654567343L, v);
//		
//		ses.persist(p);
//		ses.persist(v);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
