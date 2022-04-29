package mvc.badri.spring.BadriSpringThyme;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class BadriSpringThymeApplicationTests {

	@MockBean
	CorporateRespository repo;
	
	@Autowired
	CorporateService service;
	
	@Test
	public void testList1()
	{
		Corporate corp1=new Corporate(12009, "Cognizant", new String[] {"java","mui"}, new String[] {"banglore","chennai"}, 4.5);
		Corporate corp2=new Corporate(10073, "Capegemini", new String[] {"react"}, new String[] {"hyderabad","chennai"}, 3.1);
		Corporate corp3=new Corporate(00233, "Accenture", new String[] {"python","angular"}, new String[] {"chennai","cochin"}, 2.5);
		Corporate corp4=new Corporate(30091, "Oracle", new String[] {"java","sql"}, new String[] {"banglore","hyderabad"}, 5.2);
		Corporate corp5=new Corporate(98123, "TCS", new String[] {"oracle","angular","spring"}, new String[] {"chennai","pune"}, 5.9);
		
		when(repo.findAll()).thenReturn(Stream.of(corp1,corp2,corp3,corp4).toList());
		
		assertTrue(service.listing().size()==4);
	}
	@Test
	public void testList2()
	{
		Corporate corp1=new Corporate(12009, "Cognizant", new String[] {"java","mui"}, new String[] {"banglore","chennai"}, 4.5);
		Corporate corp2=new Corporate(10073, "Capegemini", new String[] {"react"}, new String[] {"hyderabad","chennai"}, 3.1);
		Corporate corp3=new Corporate(00233, "Accenture", new String[] {"python","angular"}, new String[] {"chennai","cochin"}, 2.5);
		Corporate corp4=new Corporate(30091, "Oracle", new String[] {"java","sql"}, new String[] {"banglore","hyderabad"}, 5.2);
		Corporate corp5=new Corporate(98123, "TCS", new String[] {"oracle","angular","spring"}, new String[] {"chennai","pune"}, 5.9);
		
		when(repo.findAll()).thenReturn(Stream.of(corp1,corp2,corp3,corp4).toList());
		
		assertNotNull(service.listing().get(1));
	}
	@Test
	public void testList3()
	{
		Corporate corp1=new Corporate(12009, "Cognizant", new String[] {"java","mui"}, new String[] {"banglore","chennai"}, 4.5);
		Corporate corp2=new Corporate(10073, "Capegemini", new String[] {"react"}, new String[] {"hyderabad","chennai"}, 3.1);
		Corporate corp3=new Corporate(00233, "Accenture", new String[] {"python","angular"}, new String[] {"chennai","cochin"}, 2.5);
		Corporate corp4=new Corporate(30091, "Oracle", new String[] {"java","sql"}, new String[] {"banglore","hyderabad"}, 5.2);
		Corporate corp5=new Corporate(98123, "TCS", new String[] {"oracle","angular","spring"}, new String[] {"chennai","pune"}, 5.9);
		
		when(repo.findAll()).thenReturn(Stream.of(corp1,corp2,corp3,corp4).toList());
		
		assertSame("Oracle",service.listing().get(3).getCorpName());
	}
	
	@Test
	public void testCreate()
	{
		Corporate corp4=new Corporate(30091, "Oracle", new String[] {"java","sql"}, new String[] {"banglore","hyderabad"}, 5.2);
		Corporate corp5=new Corporate(98123, "TCS", new String[] {"oracle","angular","spring"}, new String[] {"chennai","pune"}, 5.9);
		
		when(repo.save(corp5)).thenReturn(corp5);
		
		//assertEquals(corp4, service.saving(corp5));
		
		assertEquals(corp5, service.saving(corp5));
	}
	
	@Test
	public void testRead()
	{
		Optional<Corporate> corp1=Optional.of(new Corporate(12009, "Cognizant", new String[] {"java","mui"}, new String[] {"banglore","chennai"}, 4.5));
		Optional<Corporate> corp2=Optional.of(new Corporate(10073, "Capegemini", new String[] {"react"}, new String[] {"hyderabad","chennai"}, 3.1));
		
		when(repo.findById(10073)).thenReturn(corp2);
		
		assertNotNull(service.gettingOne(10073));
	}
	
	@Test
	public void testDelete()
	{
		Corporate corp4=new Corporate(30091, "Oracle", new String[] {"java","sql"}, new String[] {"banglore","hyderabad"}, 5.2);
		Corporate corp5=new Corporate(98123, "TCS", new String[] {"oracle","angular","spring"}, new String[] {"chennai","pune"}, 5.9);
		
		when(repo.findAll()).thenReturn(Stream.of(corp5,corp4).toList());
		
		assertFalse(service.erasing(30091).equals("TCS has deleted"));
	}
}
