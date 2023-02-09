package com.promineotech.trekbikes.service;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.dao.UpdateBikeDao;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultUpdateBikeService implements UpdateBikeService {
	

	@Transactional
	@Override
	public Optional<Bike> updateBike(String Color, String Drivetrain, String Frameset, String Handlebar, String Saddle, String Tire){
		log.info("UpdateBike has been updated Color={}, Drivetrain={}, Frameset={}, Handlebar={}, Saddle={}, Tire={}", Color, Drivetrain, Frameset, Handlebar, Saddle, Tire);
		return updateBikeDao.readBike(Color, Drivetrain, Frameset, Handlebar, Saddle, Tire);
	}
	}