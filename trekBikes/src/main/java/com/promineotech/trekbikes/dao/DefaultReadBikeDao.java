package com.promineotech.trekbikes.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultReadBikeDao implements ReadBikeDao {
	
@Autowired
private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Bike> fetchBike(String frameset, String color, String handlebar, String drivetrain,
			String saddle, String tire) {
		log.info(color, drivetrain, frameset, handlebar, saddle, tire);

	// @formatter:off
	String sql = ""
			+ "SELECT * "
			+ "FROM bike "
			+ "WHERE bike";
	// @formatter:on
	
	Map<String, Object> params = new HashMap<>();
	params.put("bike", bike);

	
	return jdbcTemplate.query(sql, params, new RowMapper<>() {
		@Override
		public Bike mapRow(Resultset.rs, String ) throws SQLException {
			// @formatter:off
			return Bike
					.builder()
					.color(color)
					.drivetrain(drivetrain)
					.frameset(frameset)
					.handlebar(handlebar)
					.saddle(saddle)
					.tire(tire)
					.build();
			// formatter:on
		}
	}
	}
}