package com.hearthstone.service;

import java.util.List;

import com.hearthstone.model.Card;
import com.hearthstone.model.HSClass;

public interface MainListService {
	
	public List<Card> getCards();

	public List<HSClass> getHSClass();
}
