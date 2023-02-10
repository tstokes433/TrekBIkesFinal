package com.promineotech.trekbikes.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.dao.UpdateBikeDao;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultUpdateBikeService implements UpdateBikeService {
	
	@Autowired
	private UpdateBikeDao updateBikeDao;
//	@Transactional
	@Override
	public Optional<Bike> updateBike(String color, String drivetrain, String frameset, String handlebar, String saddle, String tire){
		log.info("UpdateBike has been updated Color={}, Drivetrain={}, Frameset={}, Handlebar={}, Saddle={}, Tire={}", color, drivetrain, frameset, handlebar, saddle, tire);
		return updateBikeDao.updateBike(frameset, color, handlebar, drivetrain, saddle, tire);
	}
	}