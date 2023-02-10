package com.promineotech.trekbikes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.trekbikes.dao.DeleteBikeDao;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultDeleteBikeService implements DeleteBikeService {
	@Autowired
	private DeleteBikeDao deleteBikeDao;
	@Override
	public Optional<Bike> deleteBike(String color, String drivetrain, String frameset, String handlebar, String saddle, String tire){
		log.info("DeleteBike has been deleted color={}, drivetrain={}, frameset={}, handlebar={}, saddle={}, tire={}", color, drivetrain, frameset, handlebar, saddle, tire);
		return deleteBikeDao.deleteBike(color, drivetrain, frameset, handlebar, saddle, tire);
	}
	
}
