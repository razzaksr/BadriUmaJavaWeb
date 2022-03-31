package orm.hib.BadriHibernate.session3;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Execution 
{
	public static void main(String[] args) 
	{
		ElectrolRoll er1=new ElectrolRoll(81,"Salem North", "Rajendren", 12000, new String[] {"Rajendran","Selvamani"}, new Date("4/29/2022"));
		ElectrolRoll er2=new ElectrolRoll(120,"Salem West", "Arul", 9000, new String[] {"Selvaraj","R Arul"}, new Date("4/29/2022"));
		ElectrolRoll er3=new ElectrolRoll(10,"Kolathur", "MK Stalin", 10200, new String[] {"MK Stalin","Rajkumar"}, new Date("4/29/2022"));
		ElectrolRoll er4=new ElectrolRoll(210,"Nagapatinam", "Shanavas", 5400, new String[] {"Shanavas","Jeyakumar"}, new Date("4/29/2022"));
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
//		ses.persist(er1);
//		ses.persist(er2);
//		ses.persist(er3);
//		ses.persist(er4);
		
		
		// first level cache
		ElectrolRoll e=ses.get(ElectrolRoll.class, 81);
		System.out.println(e);
		e=ses.get(ElectrolRoll.class, 81);
		System.out.println(e);
		
//		e=ses.get(ElectrolRoll.class, 210);
//		System.out.println(e);
		
		ses.getTransaction().commit();
		ses.close();
		
		//second level
		ses=factory.openSession();
		ses.beginTransaction();
		e=ses.get(ElectrolRoll.class, 81);
		System.out.println(e);
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
