package orm.hib.BadriHibernate.session2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CRUDL 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		Mobile mob1=new Mobile();
		mob1.setFeature("High density camera");
		mob1.setInternal(128);mob1.setModel("Realme5s");
		mob1.setPrice(11999);mob1.setRam(4);
		
		Mobile mob2=new Mobile("Redmi10T",18999,6,64,"Ultra gaming");
		Mobile mob3=new Mobile("Noki6.1plus",13999,4,128,"Bokeh mode");
		
		//create
		session.persist(mob1);session.persist(mob2);session.persist(mob3);
		
		//list
		Query q = session.createQuery("Select price,feature from Mobile");
		List<Object[]> hey=q.list();
		
		for(int index=0;index<hey.size();index++)
		{
			System.out.println(hey.get(index)[0]+" "+hey.get(index)[1]);
		}
		
		
		//read
		Mobile temp=session.get(Mobile.class, 2);
		System.out.println(temp+"\nReaden by pk 2");
		
		//update
		mob3.setPrice(19999);
		
		session.delete(session.get(Mobile.class, 3));
		
		
		session.getTransaction().commit();
		session.close();
		
		factory.close();
	}
}
