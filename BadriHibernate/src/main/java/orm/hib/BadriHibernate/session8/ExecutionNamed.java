package orm.hib.BadriHibernate.session8;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ExecutionNamed 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
		Query q=ses.getNamedQuery("badri");
		q.setParameter("hello", 800);
		List<Superstars> li=q.getResultList();
		
		System.out.println(li);
		
		q=ses.getNamedNativeQuery("razak");
		q.setParameter("a", 6.1);
		q.setParameter("b", 6.6);
		li=q.getResultList();
		System.out.println(li);
		
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
