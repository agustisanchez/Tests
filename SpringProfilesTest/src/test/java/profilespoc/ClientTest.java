package profilespoc;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import profilespoc.client.ServiceClient;
import profilespoc.spring.ContextInitializer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:webContext.xml", initializers = ContextInitializer.class)
public class ClientTest {

	static {
	}

	@Autowired
	private ServiceClient client;

	@BeforeClass
	public static void init(){
		System.setProperty("envTarget", "mock");
	}
	
	@Test
	public void test() {

		Assert.assertNotNull(client);
	}

}
