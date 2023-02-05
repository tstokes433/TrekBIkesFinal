package com.promineotech.trekbikes.dao;

import java.util.Optional;

import com.promineotech.trekbikes.TrekBikes;

public class DefaultCreateBikeDao implements CreateBikeDao {

	@Override
	public Optional<TrekBikes> newTrekBike(String frameset, String color, String handlebar, String drivetrain,
			String saddle, String tire) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
