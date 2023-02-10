package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.service.DeleteBikeService;

@RestController
public class DefaultDeleteBikeController implements DeleteBikeController {

	@Autowired
	private DeleteBikeService deleteBikeService;
	
	@Override
	public Optional<Bike> deleteBike(String frameset, String color, String handlebar, String drivetrain,
			String saddle, String tire) {
		return deleteBikeService.deleteBike(frameset, color, handlebar, drivetrain, saddle, tire);
		
	}

}
