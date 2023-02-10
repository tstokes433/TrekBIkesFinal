package com.promineotech.trekbikes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.dao.CreateBikeDao;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j

public class DefaultCreateBikeService implements CreateBikeService {

	@Autowired
	private CreateBikeDao createBikeDao;
	
	@Override
	public Optional<Bike> newBike(String frameset, String color, String handlebar, String drivetrain,
			String saddle, String tire) {
		log.info("newTrekBike has been called for Bike frameset={}, color={}, handlebar={},drivetrain={}, saddle={}, tire={}");
		return Optional.ofNullable(createBikeDao.newBike(frameset, color, handlebar, drivetrain, saddle, tire));
	}

}
