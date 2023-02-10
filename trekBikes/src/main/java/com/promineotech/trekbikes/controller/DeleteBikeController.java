package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.entity.Bike;

import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.Parameter;

@Validated
@RequestMapping("/DeleteBIke")
@OpenAPIDefinition(info = @Info(title = "TrekBikes"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server")
})

public interface DeleteBikeController {
//Delete has one method deleteBike 


// @formatter:off	
@Operation(
		summary = "Deletes a Bike",
		description = "Deletes a built bike",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "Bike was deleted successfully.",
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
				description = "Unable to delete bike with the information given",
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
				description = "Frameset chosen for bike"),
			@Parameter(
				name = "Color",
				allowEmptyValue = false,
				required = true,
				description = "Color chosen for Handlebar"),
			@Parameter(
				name = "Handlebar",
				allowEmptyValue = false,
				required = true,
				description = "Handlebar chosen"),
			@Parameter(
				name = "Drivetrain",
				allowEmptyValue = false,
				required = true,
				description = "Drivetrain chosen"),
			@Parameter(
				name = "Saddle",
				allowEmptyValue = false,
				required = true,
				description = "Saddle chosen"),
			@Parameter(
				name = "Tire",
				allowEmptyValue = true,
				required = true,
				description = "Tire Chosen")
		}
	)
		
	@DeleteMapping
	@ResponseStatus(code = HttpStatus.OK)
	Optional<Bike> deleteBike(
		@RequestParam(required = true)String Frameset,
		@RequestParam(required = true)String Color,
		@RequestParam(required = true)String Handlebar,
		@RequestParam(required = true)String Drivetrain,
		@RequestParam(required = true)String Saddle,
		@RequestParam(required = true)String Tire);
}

