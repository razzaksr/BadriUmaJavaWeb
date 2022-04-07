package orm.hib.BadriHibernate.session7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecuteSingleTableInheritance 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
		Project pro=new Project("irctc", "indian govt", "Badri");
		
		Development dev=new Development("java", 20, "axis");
		dev.setClient("indian govt");
		dev.setManager("Mohamed");dev.setName("income tax");
		
		Testing test=new Testing("manual", "jira", 10);
		test.setClient("tn govt");
		test.setName("e-sevai");
		test.setManager("Sabari");
		
		ses.save(pro);
		ses.save(dev);
		ses.save(test);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
