package net.javaguides.lombok.logging;

import lombok.extern.slf4j.Slf4j;
import net.javaguides.lombok.User;

@Slf4j
public class UserServiceLombok {

	public void saveUser() {
		log.debug("inside saveUser() method");
	}

	public void updateUser() {
		log.debug("inside updateUser() method");
	}

	public User findUser(long id) {
		log.debug("inside findUser() method");
		log.info(new Long(id).toString());
		return null;
	}

	public void deleteUser(long id) {
		log.debug("inside deleteUser() method");
		log.info(new Long(id).toString());
	}

	public static void main(String[] args) {
		UserServiceLombok userService = new UserServiceLombok();
		userService.saveUser();
		userService.updateUser();
		userService.deleteUser(100L);
		userService.findUser(100L);
	}
}
