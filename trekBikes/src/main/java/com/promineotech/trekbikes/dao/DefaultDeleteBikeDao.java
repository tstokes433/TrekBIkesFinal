package com.promineotech.trekbikes.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.entity.Bike;

public class DefaultDeleteBikeDao implements DeleteBikeDao {


	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public Optional<Bike> deleteBike(String frameset, String color, String handlebar, String drivetrain,
			String saddle, String tire) {

	//@ formatter:off
	String sql = ""
		+ "DELETE FROM bike "
		+ "WHERE bike ";
	// @formatter:on
	
	Map<String, Object> params = new HashMap<>();
	params.put("bike", bike);

	jdbcTemplate.update(sql, params);
	return Optional.ofNullable(Bike
		// @formatter:off
		.builder()
		.color(color)
		.drivetrain(drivetrain)
		.frameset(frameset)
		.handlebar(handlebar)
		.saddle(saddle)
		.tire(tire)
		.build());
		// @formatter:on
}

}