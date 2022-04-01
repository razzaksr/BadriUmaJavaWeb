package orm.hib.BadriHibernate.session3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import orm.hib.BadriHibernate.session4.Resource;
import orm.hib.BadriHibernate.session4.Technology;

public class ExecuteMultipleEmbedded 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
		Technology tech=new Technology("java",new String[] {"Webapp","mobile app","desktop"},1000000,"Open");
		Technology techs=new Technology("python",new String[] {"django","flask","numpy","tkinter","sqlalchemy"},450000,"Open");
		//Resource res=new Resource("Badrinathan", 2, 4.5, tech,techs);
		
		//ses.save(res);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
