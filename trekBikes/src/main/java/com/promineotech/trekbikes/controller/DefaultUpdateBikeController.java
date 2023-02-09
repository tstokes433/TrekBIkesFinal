package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.TrekBikes;
@RestController
public class DefaultUpdateBikeController implements UpdateBikeController {

	@Override
	public Optional<TrekBikes> updateTrekBikes(String Frameset, String Color, 
			String Handlebar, String Drivetrain,String Saddle, String Tire, String Bike) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
