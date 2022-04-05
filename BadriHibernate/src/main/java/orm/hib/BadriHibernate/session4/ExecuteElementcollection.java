package orm.hib.BadriHibernate.session4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecuteElementcollection 
{
	public static void main(String[] args) 
	{
SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
		Technology tech=new Technology("java",new String[] {"Spring","Hibernate","JUnit","Mockito"},1000000,"Open");
		Technology techs=new Technology("python",new String[] {"django","flask","numpy","tkinter","sqlalchemy","pandas"},450000,"Open");
		Resource res=new Resource();
		res.setResName("Razak Mohamed S");
		res.setExp(11);
		res.setCtc(21.4);
		res.getSkills().add(tech);res.getSkills().add(techs);
		
		ses.save(res);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
