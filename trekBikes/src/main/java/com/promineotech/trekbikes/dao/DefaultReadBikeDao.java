package com.promineotech.trekbikes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.promineotech.trekbikes.entity.*;

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
	params.put("frameset", frameset);
	params.put("color", color);
	params.put("handlebar", handlebar);
	params.put("drivetrain", drivetrain);
	params.put("saddle", saddle);
	params.put("tire", tire);

	
	return jdbcTemplate.query(sql, params, new RowMapper<>(){
		@Override
		public Bike mapRow(ResultSet rs, int rowNum) throws SQLException {
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
	});
	}

//	@Override
//	public List<Color> fetchColor(String color) {
//		log.info(color);
//
//		// @formatter:off
//		String sql = ""
//				+ "SELECT * "
//				+ "FROM bike "
//				+ "WHERE bike";
//		// @formatter:on
//		
//		Map<String, Object> params = new HashMap<>();
//		params.put("color", color);
//
//		
//		return jdbcTemplate.query(sql, params, new RowMapper<>(){
//			@Override
//			public Color mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// @formatter:off
//				return Color
//						.builder()
//						.color(color)
//						.build();
//				// formatter:on
//			}
//		});
//	}
//
//	@Override
//	public List<Drivetrain> fetchDrivetrain(String drivetrain) {
//		log.info(drivetrain);
//
//		// @formatter:off
//		String sql = ""
//				+ "SELECT * "
//				+ "FROM bike "
//				+ "WHERE bike";
//		// @formatter:on
//		
//		Map<String, Object> params = new HashMap<>();
//		params.put("drivetrain", drivetrain);
//
//		
//		return jdbcTemplate.query(sql, params, new RowMapper<>(){
//			@Override
//			public Drivetrain mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// @formatter:off
//				return Drivetrain
//						.builder()
//						.drivetrain(drivetrain)
//						.build();
//				// formatter:on
//			}
//		});
//	}
//
//	@Override
//	public List<Frameset> fetchFrameset(String frameset) {
//		log.info(frameset);
//
//		// @formatter:off
//		String sql = ""
//				+ "SELECT * "
//				+ "FROM bike "
//				+ "WHERE bike";
//		// @formatter:on
//		
//		Map<String, Object> params = new HashMap<>();
//		params.put("frameset", frameset);;
//
//		
//		return jdbcTemplate.query(sql, params, new RowMapper<>(){
//			@Override
//			public Frameset mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// @formatter:off
//				return Frameset
//						.builder()
//						.frameset(frameset)
//						.build();
//				// formatter:on
//			}
//		});
//	}
//
//	@Override
//	public List<Handlebar> fetchHandlebar(String handlebar) {
//		log.info(handlebar);
//
//		// @formatter:off
//		String sql = ""
//				+ "SELECT * "
//				+ "FROM bike "
//				+ "WHERE bike";
//		// @formatter:on
//		
//		Map<String, Object> params = new HashMap<>();
//		params.put("handlebar", handlebar);
//
//		
//		return jdbcTemplate.query(sql, params, new RowMapper<>(){
//			@Override
//			public Handlebar mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// @formatter:off
//				return Handlebar
//						.builder()
//						.handlebar(handlebar)
//						.build();
//				// formatter:on
//			}
//		});
//	}
//
//	@Override
//	public List<Saddle> fetchSaddle(String saddle) {
//		log.info(saddle);
//
//		// @formatter:off
//		String sql = ""
//				+ "SELECT * "
//				+ "FROM bike "
//				+ "WHERE bike";
//		// @formatter:on
//		
//		Map<String, Object> params = new HashMap<>();
//		params.put("saddle", saddle);
//
//		
//		return jdbcTemplate.query(sql, params, new RowMapper<>(){
//			@Override
//			public Saddle mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// @formatter:off
//				return Saddle
//						.builder()
//						.saddle(saddle)
//						.build();
//				// formatter:on
//			}
//		});
//	}
//
//	@Override
//	public List<Tire> fetchTire(String tire) {
//		log.info(tire);
//
//		// @formatter:off
//		String sql = ""
//				+ "SELECT * "
//				+ "FROM bike "
//				+ "WHERE bike";
//		// @formatter:on
//		
//		Map<String, Object> params = new HashMap<>();
//		params.put("tire", tire);
//
//		
//		return jdbcTemplate.query(sql, params, new RowMapper<>(){
//			@Override
//			public Tire mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// @formatter:off
//				return Tire
//						.builder()
//						.tire(tire)
//						.build();
//				// formatter:on
//			}
//		});
//	}
}