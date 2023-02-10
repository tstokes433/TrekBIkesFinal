package com.promineotech.trekbikes.service;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.dao.ReadBikeDao;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DefaultReadBikeService implements ReadBikeService {
	@Autowired
	private ReadBikeDao readBikeDao;
	@Transactional	
	@Override
	public List<Bike> fetchBike(String color, String drivetrain, String frameset, String handlebar, String saddle, String tire){
		log.info("DeleteBike has been deleted Color={}, Drivetrain={}, Frameset={}, Handlebar={}, Saddle={}, Tire={}", color, drivetrain, frameset, handlebar, saddle, tire);
		return readBikeDao.fetchBike(color, drivetrain, frameset, handlebar, saddle, tire);
	}
}
