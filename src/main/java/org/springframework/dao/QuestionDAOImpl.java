package org.springframework.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.model.Option;
import org.springframework.model.Question;

class QuestionDAOImpl implements QuestionDAO{

	private static final Logger logger = LoggerFactory.getLogger(QuestionDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public List<Entry<Question, Option>> getQuestions(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Option option = (Option) session.load(Option.class, new Integer(id));
		Map<Question,Option> questionWithOption = new HashMap<Question,Option>();
		questionWithOption.put(option.getQuestion(), option);
		Set <Entry<Question, Option>> set = questionWithOption.entrySet();
		List<Entry<Question, Option>> list = new ArrayList<Entry<Question, Option>>(set);
		logger.info("Question loaded successfully");
		return list;
	}

}
