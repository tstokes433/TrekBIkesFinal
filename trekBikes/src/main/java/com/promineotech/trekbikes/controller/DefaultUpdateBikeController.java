package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.service.UpdateBikeService;
@RestController
public class DefaultUpdateBikeController implements UpdateBikeController {
	@Autowired
		private UpdateBikeService updateBikeService;
	@Override
	public Optional<Bike> updateBike(String frameset, String color, 
			String handlebar, String drivetrain, String saddle, String tire) {
		return updateBikeService.updateBike(frameset, color, handlebar, drivetrain, saddle, tire);
	}

}
