package com.hearthstone.service;

import com.hearthstone.model.User;

public interface UserAccountService {
	public User getUser(String username,String password);
}
