package com.promineotech.trekbikes.dao;

import java.util.Optional;

import com.promineotech.trekbikes.entity.*;

public interface CreateBikeDao {

	Optional<Frameset> fetchFrameset(String frameset);

	Optional<Color> fetchColor(String color);

	Optional<Handlebar> fetchHandlebar(String handlebar);

	Optional<Drivetrain> fetchDrivetrain(String drivetrain);	

	Optional<Saddle> fetchSaddle(String saddle);

	Optional<Tire> fetchTire(String tire);
	
	
	Bike newBike(String frameset, String color, String handlebar, 
			String drivetrain, String saddle, String tire);
	
}
