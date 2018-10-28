package org.springframework.dao;

import java.util.List;

import org.springframework.model.UserSelectedOption;

public interface UserSelectedDAO {
	
	public void addUserSelected(UserSelectedOption p);
	public List<UserSelectedOption> userSelectedList();

}
