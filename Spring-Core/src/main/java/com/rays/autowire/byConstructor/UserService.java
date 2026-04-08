package com.rays.autowire.byConstructor;

public class UserService {

	private UserDAOInt userDao;

	// By Constructor
	public void setUserDao(UserDAOInt userDao) {
		this.userDao = userDao;
	}

	public void tesAdd() {
		userDao.add();
	}

}
