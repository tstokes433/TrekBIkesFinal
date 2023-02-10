package com.promineotech.trekbikes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.entity.Color;
import com.promineotech.trekbikes.entity.Drivetrain;
import com.promineotech.trekbikes.entity.Frameset;
import com.promineotech.trekbikes.entity.Handlebar;
import com.promineotech.trekbikes.entity.Saddle;
import com.promineotech.trekbikes.entity.Tire;
import com.promineotech.trekbikes.service.ReadBikeService;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class DefaultReadBikeController implements ReadBikeController {

	@Autowired
	private ReadBikeService readBikeService;

	
	@Override
	public List<Bike> fetchBike(String frameset, String color, String drivetrain, String handlebar,
			String saddle, String tire) {
		log.info("frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", frameset, color, drivetrain, handlebar, saddle, tire);
		return readBikeService.fetchBike(frameset, color, drivetrain, handlebar, saddle, tire);
	}

	@Override
	public List<Frameset> fetchFrameset(String frameset) {
		log.info("frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", frameset);
		return readBikeService.fetchFrameset(frameset);
	}

	@Override
	public List<Color> fetchColor(String color) {
		log.info("frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", color);
		return readBikeService.fetchColor(color);
	}

	@Override
	public List<Drivetrain> fetchDrivetrain(String drivetrain) {
		log.info("frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", drivetrain);
		return readBikeService.fetchDrivetrain(drivetrain);
	}

	@Override
	public List<Handlebar> fetchHandlebar(String handlebar) {
		log.info("frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", handlebar);
		return readBikeService.fetchHandlebar(handlebar);
	}

	@Override
	public List<Saddle> fetchSaddle(String saddle) {
		log.info("frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", saddle);
		return readBikeService.fetchSaddle(saddle);
	}

	@Override
	public List<Tire> fetchTire(String tire) {
		log.info("frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", tire);
		return readBikeService.fetchTire(tire);

	}
}
