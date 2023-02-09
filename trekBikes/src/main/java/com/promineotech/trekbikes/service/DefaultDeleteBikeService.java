package com.promineotech.trekbikes.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.promineotech.trekbikes.dao.DeleteBikeDao;
import com.promineotech.trekbikes.entity.Bike;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultDeleteBikeService implements DeleteBikeService {

	@Override
	public Optional<Bike> deleteBike(String Color, String Drivetrain, String Frameset, String Handlebar, String Saddle, String Tire){
		log.info("DeleteBike has been deleted Color={}, Drivetrain={}, Frameset={}, Handlebar={}, Saddle={}, Tire={}", Color, Drivetrain, Frameset, Handlebar, Saddle, Tire);
		return deleteBikeDao.deleteBike(Color, Drivetrain, Frameset, Handlebar, Saddle, Tire);
	}
	
}
