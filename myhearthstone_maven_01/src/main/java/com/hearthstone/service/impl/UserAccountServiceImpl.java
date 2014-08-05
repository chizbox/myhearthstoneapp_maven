package com.hearthstone.service.impl;

import com.hearthstone.dao.UserAccountDAO;
import com.hearthstone.model.User;
import com.hearthstone.service.UserAccountService;

public class UserAccountServiceImpl implements UserAccountService {
	
	UserAccountDAO userAccountDao;

	@Override
	public User getUser(String username,String password) {
		User user = userAccountDao.getUser(username,password);
		return user;
	}

	public UserAccountDAO getUserAccountDao() {
		return userAccountDao;
	}

	public void setUserAccountDao(UserAccountDAO userAccountDao) {
		this.userAccountDao = userAccountDao;
	}

}
