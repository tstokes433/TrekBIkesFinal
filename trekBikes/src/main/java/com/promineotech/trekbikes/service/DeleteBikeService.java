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
	
	Optional<Bike> deleteBike(String Color, String Drivetrain, String Frameset, String Handlebar, String Saddle, String Tire);
	
}
