package com.promineotech.trekbikes.dao;

import java.util.List;
import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.entity.Color;
import com.promineotech.trekbikes.entity.Drivetrain;
import com.promineotech.trekbikes.entity.Frameset;
import com.promineotech.trekbikes.entity.Handlebar;
import com.promineotech.trekbikes.entity.Saddle;
import com.promineotech.trekbikes.entity.Tire;

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

	List<Color> fetchColor(String color);

	List<Drivetrain> fetchDrivetrain(String drivetrain);

	List<Frameset> fetchFrameset(String frameset);

	List<Handlebar> fetchHandlebar(String handlebar);

	List<Saddle> fetchSaddle(String saddle);

	List<Tire> fetchTire(String tire);
}
