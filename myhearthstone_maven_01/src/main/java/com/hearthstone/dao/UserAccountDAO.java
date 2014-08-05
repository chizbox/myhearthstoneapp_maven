package com.hearthstone.dao;

import com.hearthstone.model.User;

public interface UserAccountDAO {
	public User getUser(String username,String password);
}
