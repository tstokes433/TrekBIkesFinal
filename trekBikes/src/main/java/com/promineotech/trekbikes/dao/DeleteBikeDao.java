package com.promineotech.trekbikes.dao;

import java.util.Optional;

import com.promineotech.trekbikes.TrekBikes;

public interface DeleteBikeDao {

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
	Optional<TrekBikes> newTrekBike(String frameset, String color, String handlebar, 
			String drivetrain, String saddle, String tire);
	
}
