package org.springframework.service;

import java.util.List;
import java.util.Map.Entry;

import org.springframework.dao.QuestionDAO;
import org.springframework.model.Option;
import org.springframework.model.Question;

public class QuestionServiceImpl implements QuestionService {

	private QuestionDAO questionDAO;

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}

	@Override
	public List<Entry<Question, Option>> getQuestion(int id) {

		return this.questionDAO.getQuestions(id);
	}

}
