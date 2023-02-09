package com.promineotech.trekbikes.dao;

import java.util.Optional;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;

@Component 
@Slf4j
public class DefaultUpdateBikeDao implements UpdateBikeDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public Optional<Bike> updateBike(String frameset, String color, String handlebar, String drivetrain,
			String saddle, String tire) {
		return jdbcTemplate.query(sql, params,new RowMapper<>() {
			
		});
	}

}
