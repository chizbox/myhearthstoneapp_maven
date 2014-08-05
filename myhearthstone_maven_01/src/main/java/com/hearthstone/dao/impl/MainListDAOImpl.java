package com.hearthstone.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hearthstone.dao.MainListDAO;
import com.hearthstone.model.Card;
import com.hearthstone.model.HSClass;

public class MainListDAOImpl implements MainListDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public static final String SQL_GETHSCLASS = "Select * from Card_Class";

	private RowMapper<Card> mapper = new RowMapper<Card>() {

		@Override
		public Card mapRow(ResultSet rs, int row) throws SQLException {
			Card card = new Card();
			card.setClassName(rs.getString("class"));
			card.setCost(rs.getInt("cost"));
			card.setDescription(rs.getString("description"));
			card.setName(rs.getString("name"));
			card.setPower(rs.getInt("power"));
			card.setRarity(rs.getString("rarity"));
			card.setSubType(rs.getString("subtype"));
			card.setToughness(rs.getInt("toughness"));
			card.setType(rs.getString("type"));
			return card;
		}

	};
	
	private RowMapper<HSClass> hsClassMapper = new RowMapper<HSClass>() {
		@Override
		public HSClass mapRow(ResultSet rs, int row) throws SQLException {
			HSClass hsClass = new HSClass();
			hsClass.setClassCode(rs.getString("class_code"));
			hsClass.setClassDescription(rs.getString("class_desc"));
			return hsClass;
		}

	};
	
	
	

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public void createCard(String insertSql) throws DataAccessException {
		String SQL = "insert into Main_List (type,rarity,cost,description,power,toughness,"
				+ "name,class,subtype) values (?,?,?,?,?,?,?,?,?)";

		jdbcTemplateObject.update(SQL, "type", "sample", 0,
				"sample description", 10, 10, "master of sample", "any",
				"samplers");
		return;
	}

	@Override
	public Card getCard(String name) {

		return null;
	}
	
	@Override
	public List<Card> getCards() {
		String sql = "SELECT * FROM main_list";
		List<Card> cards = jdbcTemplateObject.query(sql, mapper);
		return cards;
	}

	
	public List<Card> getCardList() throws DataAccessException {
		String sql = "SELECT * FROM main_list";
		List<Card> cards = jdbcTemplateObject.query(sql, mapper);

		return cards;
	}

	@Override
	public void delete(String cardName) {

	}

	@Override
	public void update(String updateSql) {

	}

	@Override
	public List<HSClass> getHSClass() {
		List<HSClass> hsClass = jdbcTemplateObject.query(SQL_GETHSCLASS,
				hsClassMapper);

		for (HSClass hs : hsClass) {
			System.out.println(hs.getClassDescription());
		}

		return hsClass;
	}
}
