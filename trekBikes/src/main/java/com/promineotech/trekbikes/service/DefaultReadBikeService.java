package com.promineotech.trekbikes.service;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.dao.ReadBikeDao;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DefaultReadBikeService implements ReadBikeService {
	

	@Transactional	
	@Override
	public List<Bike> fetchBike(String Color, String Drivetrain, String Frameset, String Handlebar, String Saddle, String Tire){
		log.info("DeleteBike has been deleted Color={}, Drivetrain={}, Frameset={}, Handlebar={}, Saddle={}, Tire={}", Color, Drivetrain, Frameset, Handlebar, Saddle, Tire);
		return readBikeDao.readBike(Color, Drivetrain, Frameset, Handlebar, Saddle, Tire);
	}
}
