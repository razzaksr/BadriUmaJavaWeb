package orm.hib.BadriHibernate.session1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Execute 
{
	public static void main(String[] args) 
	{
		Projector pro1=new Projector("EB-S41",new Date("12/30/2021"),28999.3,"White");// transient
		Projector pro2=new Projector("EB-S41",new Date("12/30/2021"),28999.3,"Green");// transient
		Projector pro3=new Projector("EB-S41",new Date("12/30/2021"),28999.3,"Black");// transient
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses1=factory.openSession();
		ses1.beginTransaction();
		
		//persist
		
//		ses1.save(pro1);
//		ses1.save(pro2);ses1.save(pro3);
		ses1.persist(pro1);
		ses1.persist(pro2);ses1.persist(pro3);
		
		pro3.setColor("Yellow");// persist
		
		ses1.getTransaction().commit();
		ses1.close();
		
		pro1.setColor("Yellow");// detach
		
		factory.close();
		
		
	}
}
