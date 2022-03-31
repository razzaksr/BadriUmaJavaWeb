package orm.hib.BadriHibernate.session3;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ExecutionQueryCache 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		ses.beginTransaction();
		
		Query q=ses.createQuery("from ElectrolRoll");
		q.setCacheable(true);
		List<ElectrolRoll> l= q.list();
		System.out.println(l);
		
		l= q.list();
		System.out.println(l);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
