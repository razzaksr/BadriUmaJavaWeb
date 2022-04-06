package orm.hib.BadriHibernate.session6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecuteOneToMany
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
//		Vehicle v1=new Vehicle(9478, 2021, 611000, "Ignis");
//		Vehicle v2=new Vehicle(4192, 2016, 105000, "Avenger220");
//		Person p=new Person("Razak Mohamed S", "SAlem", 87654567343L);
//		p.getGariage().add(v1);p.getGariage().add(v2);
//		
//		ses.persist(p);
//		ses.persist(v1);ses.persist(v2);
		
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
