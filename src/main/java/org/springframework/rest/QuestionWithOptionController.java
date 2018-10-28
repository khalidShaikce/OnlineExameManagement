package org.springframework.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.model.Option;
import org.springframework.model.Question;
import org.springframework.service.QuestionServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionWithOptionController {

	@Autowired
	QuestionServiceImpl questionServiceImpl;
	
//	private static final Map<Question, Option> option = new HashMap<Question, Option>();
//	private static final Map<Integer, Map<Question, Option>> option1 =new HashMap<Integer,Map<Question,Option>>();
//	static {
//	try {
//		Question question =new Question(1,"Cooooooolkdjfldkjffjldkf");
//		option.put(question, new Option(1,question,"sdf","dfdf","dfdf","dfdfdf"));
//		option1.put(1, option);
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
//	}
	
	@RequestMapping(value = "/rest/{questionNo}", method = RequestMethod.GET)
	@ResponseBody public List<Entry< Question, Option>> findQuestion(@PathVariable int questionNo) {
		
//		Set<Entry<Question, Option>> qsb=option.entrySet();
//		List<Entry<Question,Option>> lsb=new ArrayList<Entry<Question, Option>>(qsb);
		return this.questionServiceImpl.getQuestion(questionNo);
	}
	
	
	
}
