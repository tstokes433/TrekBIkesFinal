package com.promineotech.trekbikes.controller;

import java.util.List;

import com.promineotech.trekbikes.entity.Frameset;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import com.promineotech.trekbikes.*;
import com.promineotech.trekbikes.entity.Trek;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/trekbikes")
@OpenAPIDefinition(info = @Info(title = "Trek Bikes Build"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server.")})


public interface ReadBikesController {
	
	//@formatter:off
		@Operation(
			summary = "Returns a list of Trek Bike components",
			description = "Returns a list of Bike components",
			responses = {
				
				@ApiResponse(responseCode = "200", 
						description = "The list of Bike options is returned", 
						content = @Content(
						mediaType = "application/json", 
						schema = @Schema(
						implementation = TrekBikes.class))),
				
				@ApiResponse(responseCode = "400", 
						description = "The request parameters are invalid", 
						content = @Content(
						mediaType = "application/json")),
				
				@ApiResponse(responseCode = "404",  
						description = "No Bike component were found with the input criteria", 
						content = @Content(
						mediaType = "application/json")),
				
				@ApiResponse(responseCode = "500",  
						description = "An unplanned error occured.", 
						content = @Content(
						mediaType = "application/json"))
			},
	//Do i need a parameter for each Entity???		
			parameters = { 
				@Parameter(
						name = "Frameset",  
						required = true, 
						description = "Frameset Needed for a Bike"),
				@Parameter(
						name = "Color",  
						required = true, 
						description = "Color Needed for a Bike"),
				@Parameter(
						name = "Drivetrain",  
						required = true, 
						description = "Drivetrain Needed for a Bike"),
				@Parameter(
						name = "Handlebar",  
						required = true, 
						description = "Handlebar Needed for a Bike"),
				@Parameter(
						name = "Saddle",  
						required = true, 
						description = "Saddle Needed for a Bike"),
				@Parameter(
						name = "Tire",  
						required = true, 
						description = "Tires Needed for a Bike")
				
			}
		)
		@GetMapping
		@PostMapping 
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);
//????? Do i need to list more than just Frameset 
		List<TrekBikes> fetchTrekBikes(
				@RequestParam(required = true) String frameset,
				@RequestParam(required = true) String color,
				@RequestParam(required = true) String drivetrain,
				@RequestParam(required = true) String handlebar,
				@RequestParam(required = true) String saddle,
				@RequestParam(required = true) String tire);	
	
		//@formatter:on
	}

