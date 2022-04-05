package orm.hib.BadriHibernate.session5;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecuteTempTransOptional 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		ses.beginTransaction();
		
//		Item it=new Item();
//		it.setItemName("10T");it.setItemExpiry(new Date("3/20/2022"));
//		it.setPrice(200000);
//		ses.save(it);
		
		Item its=new Item();
		its.setBrand("Redmi");its.setItemExpiry(new Date("4/22/2022"));
		its.setItemName("10Pro");its.setPrice(20000);
		
		ses.persist(its);
		
		ses.getTransaction().commit();
		ses.close();
		
		factory.close();
	}
}
