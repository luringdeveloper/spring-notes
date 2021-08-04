package com.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class Dao {

	private static JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public static JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public static void setJdbcTemplate(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	
}
