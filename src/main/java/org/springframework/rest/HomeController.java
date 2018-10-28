package org.springframework.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.model.UserSelectedOption;
import org.springframework.service.UserSelectedServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@Autowired
	UserSelectedServiceImpl productServiceImpl;
	
//	private static final Map<Integer, UserSelectedOption> option = new HashMap<Integer, UserSelectedOption>();
	
//	static {
//		try {
//			option.put(1, new User(2,"Garden  Cart","GDN-909",new Date(0),"Cool!!",1200,4,new URL("https://openclipart.org/image/2400px/svg_to_png/280962/ladyinreddances.png")));
//			option.put(2, new Product(3,"Demon Gate","GDN-909",new Date(0),"Cool!!",1250,3,new URL("https://openclipart.org/image/90px/svg_to_png/290901/pixeldemon.png")));
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/rest/{questionNo}/{optionSelected}", method = RequestMethod.POST)
	@ResponseBody public void find(@PathVariable int questionNo, @PathVariable int optionSelected) {
		UserSelectedOption userSelectedOption = new UserSelectedOption(questionNo, optionSelected);
		productServiceImpl.addUserSelected(userSelectedOption);
	}
	
	@RequestMapping(value = "/rest/list", method = RequestMethod.GET)
	@ResponseBody public List<UserSelectedOption> findOption() {
		return productServiceImpl.listUserSelected();
		
	}
	
}
