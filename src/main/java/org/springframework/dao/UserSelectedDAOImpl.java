package org.springframework.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.model.UserSelectedOption;

public class UserSelectedDAOImpl implements UserSelectedDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserSelectedDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addUserSelected(UserSelectedOption p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Inserted selected option, saved successfully, Product Details = " + p);

	}
	
	@Override
	public List<UserSelectedOption> userSelectedList() {
		Session session = this.sessionFactory.getCurrentSession();
		List<UserSelectedOption> userSelectedList = session.createQuery("from UserSelecteOption").list();
		for(UserSelectedOption p : userSelectedList){
			logger.info("User option List::"+p);
		}
		return userSelectedList;
	}

}
