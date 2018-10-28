package org.springframework.service;

import java.util.List;
import org.springframework.dao.UserSelectedDAO;
import org.springframework.model.UserSelectedOption;

public class UserSelectedServiceImpl implements UserSelectedService {

	private UserSelectedDAO userSelectedDAO;

	public void setUserSelectedDAO(UserSelectedDAO productDAO) {
		
		this.userSelectedDAO = productDAO;
	}

	@Override
	public void addUserSelected(UserSelectedOption p) {
		
		this.userSelectedDAO.addUserSelected(p);
	}

	@Override
	public List<UserSelectedOption> listUserSelected() {

		return this.userSelectedDAO.userSelectedList();
	}

}
