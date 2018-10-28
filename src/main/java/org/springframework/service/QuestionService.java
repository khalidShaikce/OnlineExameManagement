package org.springframework.service;

import java.util.List;
import java.util.Map.Entry;

import org.springframework.model.Option;
import org.springframework.model.Question;

public interface QuestionService {

	public List<Entry<Question, Option>> getQuestion(int id);

}
