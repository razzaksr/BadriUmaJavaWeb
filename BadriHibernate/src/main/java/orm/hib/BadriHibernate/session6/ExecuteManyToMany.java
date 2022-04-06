package orm.hib.BadriHibernate.session6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecuteManyToMany 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
		Vehicle v1=new Vehicle(9478, 2021, 611000, "Ignis");
		Vehicle v2=new Vehicle(4192, 2016, 105000, "Avenger220");
		Vehicle v3=new Vehicle(9865,2022,943000,"Baleno Zeta");
		Person p1=new Person("Razak Mohamed S", "SAlem", 87654567343L);
		Person p2=new Person("Annamalai S", "SAlem", 987656343234L);
		
		p1.getGariage().add(v1);p1.getGariage().add(v3);p1.getGariage().add(v2);
		p2.getGariage().add(v1);p2.getGariage().add(v3);
		
		v1.getCustomers().add(p1);
		v1.getCustomers().add(p2);
		v2.getCustomers().add(p1);
		v3.getCustomers().add(p1);
		v3.getCustomers().add(p2);
		
		ses.persist(p1);ses.persist(p2);
		ses.persist(v1);ses.persist(v2);ses.persist(v3);
		
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}

