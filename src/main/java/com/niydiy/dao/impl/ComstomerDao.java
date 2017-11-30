package com.niydiy.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.niydiy.dao.CustomerDao;
import com.niydiy.domain.Customer;

public class ComstomerDao extends HibernateDaoSupport implements CustomerDao {
	/×private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(Customer customer) {
		hibernateTemplate.save(customer);
	}×/
	public void save(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}
}
