package orm.hib.BadriHibernate.session2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomTableFields
{
	public static void main(String[] args) 
	{
		Mobile mob1=new Mobile();
		mob1.setFeature("High density camera");
		mob1.setInternal(128);mob1.setModel("Realme5s");
		mob1.setPrice(11999);mob1.setRam(4);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
		ses.persist(mob1);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
