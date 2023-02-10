package com.promineotech.trekbikes.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.entity.Color;
import com.promineotech.trekbikes.entity.Drivetrain;
import com.promineotech.trekbikes.entity.Frameset;
import com.promineotech.trekbikes.entity.Handlebar;
import com.promineotech.trekbikes.entity.Saddle;
import com.promineotech.trekbikes.entity.Tire;

import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j

public class DefaultCreateBikeDao implements CreateBikeDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public Bike newBike(String frameset, String color, String handlebar, String drivetrain,
			String saddle, String tire) {
		log.info("DAO: frameset={}, color={}, handlebar={}, drivetrain={}, saddle={}, tire={}", frameset, color, handlebar, drivetrain, saddle, tire);
		
		// @formatter:off
		String sql = ""
				+ "INSERT INTO bike ("
				+ "frameset, color, handlebar, drivetrain, saddle, tire"
				+ ") VALUES ("
				+ ":frameset, :color, :handlebar, :drivetrain, :saddle, :tire;"
				+ ")";
		// @formatter:on
		
		Map<String, Object> params = new HashMap<>();
		params.put("frameset", frameset);
		params.put("color", color);
		params.put("handlebar", handlebar);
		params.put("drivetrain", drivetrain);
		params.put("saddle", saddle);
		params.put("tire", tire);
		
		

		jdbcTemplate.update(sql, params);
		return Bike.builder()
			// @formatter:off
			.frameset(frameset)
			.color(color)
			.handlebar(handlebar)
			.drivetrain(drivetrain)
			.saddle(saddle)
			.tire(tire)
			.build();
			// @formatter:on
		}

	@Override
	public Optional<Frameset> fetchFrameset(String frameset) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Color> fetchColor(String color) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Handlebar> fetchHandlebar(String handlebar) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Drivetrain> fetchDrivetrain(String drivetrain) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Saddle> fetchSaddle(String saddle) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Tire> fetchTire(String tire) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
}
