package com.promineotech.trekbikes.controller;
//MY INMPLMENTING CLASS
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.TrekBikes;

@RestController
public class TrekBikesController
		implements CreateBikeController, DeleteBikeController, ReadBikesController, UpdateBikeController {

	@Override
	public List<TrekBikes> fetchTrekBikes(String frameset, String color, String drivetrain, String handlebar,
			String saddle, String tire) {
		// TODO Auto-generated method stub
		return null;
	}

}
