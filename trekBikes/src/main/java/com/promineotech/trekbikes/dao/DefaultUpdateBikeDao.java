package com.promineotech.trekbikes.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
		log.info("DAO: frameset={}, color={}, handlebart={}, drivetrain={}, saddle={}, tire={}, updated to: newFrameset={}, newColor={}, newHandlebar={}, newDrivetrain={}, newSaddle={}, newTire={}", 
				frameset, color, handlebar, drivetrain, saddle, tire);
			
		//@formatter:off
		String sql = ""
				+ "UPDATE bike"
				+"SET new_bike = :new_Frameset, new_Color, new_Handlebar, new_Drivetrain, new_Saddle, new_Tire"
				+"WHERE (bike)";
		//@formatter:on
		

		Map<String, Object> params = new HashMap<>();
		params.put("frameset", frameset);
		params.put("color", color);
		params.put("handlebar", handlebar);
		params.put("drivetrain", drivetrain);
		params.put("saddle", saddle);
		params.put("tire", tire);

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


