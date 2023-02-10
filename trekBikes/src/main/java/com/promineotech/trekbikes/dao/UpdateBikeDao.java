package com.promineotech.trekbikes.dao;

import java.util.Optional;

import com.promineotech.trekbikes.entity.Bike;

public interface UpdateBikeDao {
	
	/**
	 * 
	 * @param frameset
	 * @param color
	 * @param handlebar
	 * @param drivetrain
	 * @param saddle
	 * @param tire
	 * @return
	 */
	Optional<Bike> updateBike(String frameset, String color, String handlebar, 
			String drivetrain, String saddle, String tire);

}
