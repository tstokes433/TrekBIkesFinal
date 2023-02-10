package com.promineotech.trekbikes.service;

import java.util.Optional;

import com.promineotech.trekbikes.entity.Bike;

public interface CreateBikeService {

	
	/**
	 * @param bike
	 * @param frameset
	 * @param color
	 * @param handlebar
	 * @param drivetrain
	 * @param saddle
	 * @param tire
	 * @return
	 */
	Optional<Bike> newBike(String frameset, String color, String handlebar, 
			String drivetrain, String saddle, String tire);
}
