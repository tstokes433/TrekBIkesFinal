package com.promineotech.trekbikes.service;

import java.util.List;

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.entity.Color;
import com.promineotech.trekbikes.entity.Drivetrain;
import com.promineotech.trekbikes.entity.Frameset;
import com.promineotech.trekbikes.entity.Handlebar;
import com.promineotech.trekbikes.entity.Saddle;
import com.promineotech.trekbikes.entity.Tire;

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
	List<Bike> fetchBike(String color, String drivetrain, String frameset, String handlebar, String saddle, String tire);

	List<Frameset> fetchFrameset(String frameset);

	List<Color> fetchColor(String color);

	List<Drivetrain> fetchDrivetrain(String drivetrain);

	List<Handlebar> fetchHandlebar(String handlebar);

	List<Saddle> fetchSaddle(String saddle);

	List<Tire> fetchTire(String tire);


	
}
