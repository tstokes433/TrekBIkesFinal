package com.promineotech.trekbikes.service;

import java.util.List;
import java.util.Optional;

import com.promineotech.trekbikes.entity.Bike;


public interface UpdateBikeService {

	
	/**
	 * 
	 * @param Color
	 * @param Drivetrain
	 * @param Frameset
	 * @param Handlebar
	 * @param Saddle
	 * @param Tire
	 * @return
	 */
	
	Optional<Bike> updateBike(String Color, String Drivetrain, String Frameset, String Handlebar, String Saddle, String Tire);
	
}
