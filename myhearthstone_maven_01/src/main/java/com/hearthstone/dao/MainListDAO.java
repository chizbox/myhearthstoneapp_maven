package com.hearthstone.dao;

import java.util.List;

import javax.sql.DataSource;

import com.hearthstone.model.Card;
import com.hearthstone.model.HSClass;

public interface MainListDAO {

	public void setDataSource(DataSource ds);

	public void createCard(String insertSql);

	public Card getCard(String name);

	public List<Card> getCards();

	public void delete(String cardName);

	public void update(String updateSql);
	
	public List<HSClass> getHSClass();
	
}
