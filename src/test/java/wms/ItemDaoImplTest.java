package wms;
import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import com.sheri.wms.dao.ItemDao;
import com.sheri.wms.entity.ItemEntity;


//@ComponentScan("/wms/target/wms/WEB-INF/dispatcher-servlet.xml")
@ContextConfiguration(locations= {"classpath:dispatcher-servlet.xml"})
public class ItemDaoImplTest
{
	
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	ItemDao itemDao;
	
	
	@BeforeClass
	public static void beforeTest()
	{
		
	}
	@Test
	@Transactional
	public void getItemTest()
	{
		ItemEntity item;
		item=new ItemEntity();
		item.setItemId(100);
		item.setItemName("fan");
		item.setItemDescription("UshaFan");
		sessionFactory.getCurrentSession().saveOrUpdate(item);
		ItemEntity itemtoTest=itemDao.getItemById(100);
		assertEquals(itemtoTest.getItemName(), item.getItemName());
	}

}
