package net.javaguides.lombok.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.javaguides.lombok.User;

public class UserService {
	public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	public void saveUser() {
		LOGGER.debug("inside saveUser() method");
	}

	public void updateUser() {
		LOGGER.debug("inside updateUser() method");
	}

	public User findUser(long id) {
		LOGGER.debug("inside findUser() method");
		LOGGER.info(new Long(id).toString());
		return null;
	}

	public void deleteUser(long id) {
		LOGGER.debug("inside deleteUser() method");
		LOGGER.info(new Long(id).toString());
	}
}
