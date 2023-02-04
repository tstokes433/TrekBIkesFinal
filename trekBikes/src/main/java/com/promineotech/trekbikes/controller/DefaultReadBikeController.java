package com.promineotech.trekbikes.controller;

import java.util.List;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.entity.Color;
import com.promineotech.trekbikes.entity.Drivetrain;
import com.promineotech.trekbikes.entity.Frameset;
import com.promineotech.trekbikes.entity.Handlebar;
import com.promineotech.trekbikes.entity.Saddle;
import com.promineotech.trekbikes.entity.Tire;

public class DefaultReadBikeController implements ReadBikesController {

	@Override
	public List<TrekBikes> fetchTrekBikes(String frameset, String color, String drivetrain, String handlebar,
			String saddle, String tire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Frameset> fetchFrameset(String frameset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Color> fetchColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Drivetrain> fetchDrivetrain(String drivetrain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Handlebar> fetchHandlebar(String handlebar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Saddle> fetchSaddle(String saddle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tire> fetchTire(String tire) {
		// TODO Auto-generated method stub
		return null;
	}

}
