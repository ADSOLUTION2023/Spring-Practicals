package com.rays.autowire.byType;

public class UserService {
	private UserDAOInt userDao;
	//by Property type

	public void setUserDao(UserDAOInt userDao) {
		this.userDao = userDao;
	}
	public void testAdd() {
		userDao.add();
	}

}
