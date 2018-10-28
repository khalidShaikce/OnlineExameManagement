package org.springframework.dao;

import java.util.List;
import java.util.Map.Entry;

import org.springframework.model.Option;
import org.springframework.model.Question;

public interface QuestionDAO {

	public List<Entry<Question,Option>> getQuestions(int id);
	
}
