package ssh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niydiy.service.CustomerService;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = (CustomerService) ac.getBean("customerService");
		service.save(null);
	}

}
