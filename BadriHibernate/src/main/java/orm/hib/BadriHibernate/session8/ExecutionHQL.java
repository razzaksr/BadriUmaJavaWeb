package orm.hib.BadriHibernate.session8;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ExecutionHQL 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
//		Superstars sup1=new Superstars(1, "Undertaker", 320.4, "World Chanpion", 6.11, 1200);
//		Superstars sup2=new Superstars(2, "Randy Orton", 250.4, "Tag Champion", 6.4, 820);
//		Superstars sup3=new Superstars(5, "Brock lesnar", 390.4, "Wwe champion", 6.4, 450);
//		Superstars sup4=new Superstars(3, "Jhon Cena", 310.4, "IC champion", 6.1, 760);
//		Superstars sup5=new Superstars(9, "Triple H", 290.1, "Heavy weight champion", 6.3, 910);
//		Superstars sup6=new Superstars(100, "Roman reigns", 340.4, "Universal Chanpion", 6.5, 610);
//		Superstars sup7=new Superstars(4, "Matt riddle", 210.5, "Tag Chanpion", 6.4, 320);
//		
//		ses.save(sup1);ses.save(sup2);ses.save(sup3);ses.save(sup4);
//		ses.save(sup5);ses.save(sup6);ses.save(sup7);
		
//		Query q=ses.createQuery("from Superstars");
//		List<Superstars> li = q.getResultList();
//		
//		for(Superstars s:li)
//		{
//			System.out.println(s);
//		}
		
//		Query q=ses.createQuery("Select weight from Superstars");
//		List<Double> wt= q.getResultList();
//		System.out.println(wt);
		
//		Query q=ses.createQuery("Select fightFoughts, weight from Superstars");
//		q.setMaxResults(3);
//		List<Object[]> wt= q.getResultList();
//		
//		//System.out.println(wt);
//		
//		for(Object[] s:wt)
//		{
//			System.out.println(Arrays.toString(s));
//		}
		
		
		Query q=ses.createQuery("from Superstars where weight>=:hai");
		q.setParameter("hai", 200.4);
		List<Superstars> wt= q.getResultList();
		System.out.println(wt);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
