package com.promineotech.trekbikes.service;

import java.util.Optional;

import com.promineotech.trekbikes.entity.Bike;

public interface DeleteBikeService {

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
	
	Optional<Bike> deleteBike(String color, String drivetrain, String frameset, String handlebar, String saddle, String tire);
	
}
