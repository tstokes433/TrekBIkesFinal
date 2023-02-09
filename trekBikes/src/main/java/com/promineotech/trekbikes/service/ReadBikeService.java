package com.promineotech.trekbikes.service;

import java.util.List;

import com.promineotech.trekbikes.entity.Bike;

public interface ReadBikeService {

	
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
	List<Bike> fetchBike(String Color, String Drivetrain, String Frameset, String Handlebar, String Saddle, String Tire);
	
}
