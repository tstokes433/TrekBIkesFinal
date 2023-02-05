package com.promineotech.trekbikes.dao;

import java.util.Optional;

import com.promineotech.trekbikes.TrekBikes;

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
	Optional<TrekBikes> updateTrekBike(String frameset, String color, String handlebar, 
			String drivetrain, String saddle, String tire);

}
