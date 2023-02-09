package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.service.CreateBikeService;
@RestController
public class DefaultCreateBikeController implements CreateBikeController {

	@Autowired
	private CreateBikeService createBikeService;
	
	@Override
	public Optional<TrekBikes> newTrekBikes(String frameset, String color, String drivetrain, String handlebar,
			String saddle, String tire, String bike) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
