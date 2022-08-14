package springggmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springggmvc.dao.UserDao;
import springggmvc.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}

}
