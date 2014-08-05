package com.hearthstone.service.impl;

import java.util.List;

import com.hearthstone.dao.MainListDAO;
import com.hearthstone.model.Card;
import com.hearthstone.model.HSClass;
import com.hearthstone.service.MainListService;

public class MainListServiceImpl implements MainListService {

	MainListDAO mainListDao;

	@Override
	public List<Card> getCards() {
		List<Card> cards = mainListDao.getCards();
		return cards;
	}

	public MainListDAO getMainListDao() {
		return mainListDao;
	}

	public void setMainListDao(MainListDAO mainListDao) {
		this.mainListDao = mainListDao;
	}

	@Override
	public List<HSClass> getHSClass() {
		List<HSClass> hSClass = mainListDao.getHSClass();
		return hSClass;
	}
}
