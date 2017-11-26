package ssh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niydiy.domain.Customer;
import com.niydiy.service.CustomerService;

public class SpringHibernateTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = (CustomerService) ac.getBean("customerService");
		Customer customer = new Customer();
		customer.setCustAddress("chengdu");
		customer.setCustName("2323");
		customer.setCustPhone("028-9996663358");
		service.save(customer);
	}

}
