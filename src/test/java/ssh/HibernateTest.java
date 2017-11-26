package ssh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.niydiy.domain.Customer;

public class HibernateTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustName("macro chen");
		customer.setCustPhone("028-66776677");
		customer.setCustAddress("成都");
		session.save(customer);
		transaction.commit();
	}
}
