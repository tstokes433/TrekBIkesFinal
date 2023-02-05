package com.promineotech.trekbikes.dao;

import java.util.List;
import com.promineotech.trekbikes.TrekBikes;

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
	List<TrekBikes> fetchTrekBikes(String frameset, String color, String handlebar, 
			String drivetrain, String saddle, String tire);
}
