/**
 * 
 */
package org.springframework.service;

import java.util.List;
import org.springframework.model.UserSelectedOption;

/**
 * @author Admin
 *
 */
public interface UserSelectedService {

	public void addUserSelected(UserSelectedOption p);
	public List<UserSelectedOption> listUserSelected();
}
