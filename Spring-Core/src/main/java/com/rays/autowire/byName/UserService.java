package com.rays.autowire.byName;

public class UserService {
	private UserDAOInt userDao;
	//by property name;

	public void setUserDao(UserDAOInt userDao) {
		this.userDao = userDao;
	}
	
	public void testAdd() {
		userDao.add();
	}

}
