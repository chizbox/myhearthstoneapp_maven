package com.hearthstone.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hearthstone.dao.UserAccountDAO;
import com.hearthstone.model.User;

public class UserAccountDaoImpl implements UserAccountDAO {

	private static final String FIND_USER = "Select * from users where username=? and password=?";

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	private RowMapper<User> mapper = new RowMapper<User>() {
		@Override
		public User mapRow(ResultSet rs, int row) throws SQLException {
			User user = new User();
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setEmail(rs.getString("email"));
			user.setLastName(rs.getString("lastname"));
			user.setFirstName(rs.getString("firstname"));
			user.setFirstName(rs.getString("middle"));
			return user;
		}
	};

	@Override
	public User getUser(String username, String password) {

		User user = new User();

		List<User> users = jdbcTemplateObject.query(FIND_USER, mapper,
				username, password);

		if (!users.isEmpty()) {
			user = users.get(0);
		}

		return user;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

}
