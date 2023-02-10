package com.promineotech.trekbikes.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.trekbikes.TrekBikes;
import com.promineotech.trekbikes.entity.Bike;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;


@Validated
@RequestMapping("/UpdateBike")
@OpenAPIDefinition(info = @Info(title = "Trek Bikes"), servers = {
	@Server(url = "http://localhost:8080", description = "Local server")})
public interface UpdateBikeController {
	//Updates Bike

		// @formatter:off
		@Operation(
			summary = "Updates a Bike",
			description = "Updates a Bike",
			responses = {
				@ApiResponse(
					responseCode = "200",
					description = "The Bike information was updated successfully.",
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
					description = "Unable to update Trek Bike with the information given",
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
					name = "frameset",
					allowEmptyValue = false,
					required = true,
					description = "Frameset chosen for bike"),
				@Parameter(
					name = "color",
					allowEmptyValue = false,
					required = true,
					description = "Color chosen for Handlebar"),
				@Parameter(
					name = "handlebar",
					allowEmptyValue = false,
					required = true,
					description = "Handlebar chosen"),
				@Parameter(
					name = "drivetrain",
					allowEmptyValue = false,
					required = true,
					description = "Drivetrain chosen"),
				@Parameter(
					name = "saddle",
					allowEmptyValue = false,
					required = true,
					description = "Saddle chosen"),
				@Parameter(
					name = "tire",
					allowEmptyValue = true,
					required = true,
					description = "Tire Chosen")
	}	

		)

		@PutMapping
		@ResponseStatus(code = HttpStatus.OK)
		Optional<Bike> updateBike(
				@RequestParam(required = true)String frameset,
				@RequestParam(required = true)String color,
				@RequestParam(required = true)String handlebar,
				@RequestParam(required = true)String drivetrain,
				@RequestParam(required = true)String saddle,
				@RequestParam(required = true)String tire);

		// @formatter:on
}
