package com.promineotech.trekbikes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.dao.CreateBikeDao;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j

public class DefaultCreateBikeService implements CreateBikeService {

	@Autowired
	private CreateBikeDao createBikeDao;
	
	@Override
	public Optional<TrekBikes> newTrekBike(String frameset, String color, String handlebar, String drivetrain,
			String saddle, String tire, String bike) {
		log.info("newTrekBike has been called for Bike frameset={}, color={}, handlebar={},drivetrain={}, saddle={}, tire={}");
		return createBikeDao.newTrekBike(frameset, color, handlebar, drivetrain, saddle, tire);
	}

}
