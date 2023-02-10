package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.service.CreateBikeService;
@RestController
public class DefaultCreateBikeController implements CreateBikeController {

	@Autowired
	private CreateBikeService createBikeService;
	
	@Override
	public Optional<Bike> newBike(String frameset, String color, String drivetrain, String handlebar,
			String saddle, String tire) {
		return createBikeService.newBike(frameset, color, handlebar, drivetrain, saddle, tire);
	}

}
