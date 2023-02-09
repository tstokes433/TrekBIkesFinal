package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.service.DeleteBikeService;
@RestController
public class DefaultDeleteBikeController implements DeleteBikeController {

	@Autowired
	private DeleteBikeService deleteBikeService;
	
	@Override
	public Optional<TrekBikes> deleteTrekBikes(String Frameset, String Color, String Handlebar, String Drivetrain,
			String Saddle, String Tire, String Bike) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
