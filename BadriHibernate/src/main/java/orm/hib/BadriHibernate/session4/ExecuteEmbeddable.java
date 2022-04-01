package orm.hib.BadriHibernate.session4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecuteEmbeddable 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
		Technology tech=new Technology("java",new String[] {"Webapp","mobile app","desktop"},1000000,"Open");
		//Resource res=new Resource("Badrinathan", 2, 4.5, tech);
		
		//ses.save(res);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
