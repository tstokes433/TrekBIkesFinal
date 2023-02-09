package com.promineotech.trekbikes.dao;

import java.util.List;
import com.promineotech.trekbikes.entity.Bike;

public interface ReadBikeDao {

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
	List<Bike> fetchBike(String frameset, String color, String handlebar, 
			String drivetrain, String saddle, String tire);
}
