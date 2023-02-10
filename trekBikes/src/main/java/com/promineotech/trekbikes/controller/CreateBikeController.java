package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.entity.Bike;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;


@Validated
@RequestMapping("/CreateBike")
@OpenAPIDefinition(info = @Info(title = "TrekBikes"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server")
})
@ApiResponse

public interface CreateBikeController {
	//CREATE has one Method CreateBike

	//createBike()
		// @formatter:off
		@Operation(
			summary = "Adds a Complete Trek Bike",
			description = "Creates a New Bike with all components",
			responses = {
				@ApiResponse(
					responseCode = "201",
					description = "New Trek Bike",
					content = @Content(
						mediaType = "application/json",
						schema = @Schema(implementation = TrekBikes.class))),
				@ApiResponse(
					responseCode = "400",
					description = "Invalid request parameters",
					content = @Content(
						mediaType = "application/json")),
				@ApiResponse(
					responseCode = "404",
					description = "Unable to create new Trek bike",
					content = @Content(
						mediaType = "application/json")),
				@ApiResponse(
					responseCode = "500",
					description = "An unplanned error has occurred.",
					content = @Content(
						mediaType = "application/json"))
			},
			parameters = { 
				@Parameter(
					name = "Frameset",  
					allowEmptyValue = false,
					required = true,
					description = "Frameset Needed for a Bike"),
				@Parameter(
					name = "Color",  
					allowEmptyValue = false,
					required = true, 
					description = "Color Needed for a Bike"),
				@Parameter(
					name = "Drivetrain",  
					allowEmptyValue = false,
					required = true, 
					description = "Drivetrain Needed for a Bike"),
				@Parameter(
					name = "Handlebar",  
					allowEmptyValue = false,
					required = true, 
					description = "Handlebar Needed for a Bike"),
				@Parameter(
					name = "Saddle",  
					allowEmptyValue = false,
					required = true, 
					description = "Saddle Needed for a Bike"),
				@Parameter(
					name = "Tire",  
					allowEmptyValue = false,
					required = true, 
					description = "Tires Needed for a Bike")		
		
			}
		)


		Optional<Bike> newBike(
				@RequestParam(required = true) 
				String frameset,
				@RequestParam(required = true) 
				String color,
				@RequestParam(required = true) 
				String drivetrain,
				@RequestParam(required = true) 
				String handlebar,
				@RequestParam(required = true) 
				String saddle,
				@RequestParam(required = true) 
				String tire);
		// @formatter:on
}




