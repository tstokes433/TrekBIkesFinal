package com.promineotech.trekbikes.controller;

import java.util.List;

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.entity.Color;
import com.promineotech.trekbikes.entity.Drivetrain;
import com.promineotech.trekbikes.entity.Frameset;
import com.promineotech.trekbikes.entity.Handlebar;
import com.promineotech.trekbikes.entity.Saddle;
import com.promineotech.trekbikes.entity.Tire;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.trekbikes.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/ReadBike")
@OpenAPIDefinition(info = @Info(title = "Trek Bikes Build"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server.")})


public interface ReadBikeController {
	
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
		
			parameters = { 
				@Parameter(
						name = "Frameset",  
						required = false, 
						description = "Frameset Needed for a Bike"),
				@Parameter(
						name = "Color",  
						required = false, 
						description = "Color Needed for a Bike"),
				@Parameter(
						name = "Drivetrain",  
						required = false, 
						description = "Drivetrain Needed for a Bike"),
				@Parameter(
						name = "Handlebar",  
						required = false, 
						description = "Handlebar Needed for a Bike"),
				@Parameter(
						name = "Saddle",  
						required = false, 
						description = "Saddle Needed for a Bike"),
				@Parameter(
						name = "Tire",  
						required = false, 
						description = "Tires Needed for a Bike"),
				@Parameter(
						name = "Bike",  
						required = false, 
						description = "The Built Bike")
				
			}
		)
		@GetMapping(value = "/fetchTrekBikes")
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);

		List<Bike> fetchBike(
				@RequestParam(required = false) String frameset,
				@RequestParam(required = false) String color,
				@RequestParam(required = false) String drivetrain,
				@RequestParam(required = false) String handlebar,
				@RequestParam(required = false) String saddle,
				@RequestParam(required = false) String tire);	
		
		//@formatter:on

		
		//Method for frameset
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
						required = false, 
						description = "Frameset Needed for a Bike")
				
			}
		)
		@GetMapping(value = "/frameset")
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);

		List<Frameset> fetchFrameset(
				@RequestParam(required = false) String frameset);
	

		//@formatter:on
		
		// Method for Color
		
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
			
			parameters = { 
				@Parameter(
						name = "Color",  
						required = false, 
						description = "Color Needed for a Bike"),
			}
		)
		@GetMapping(value = "/color")
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);

		List<Color> fetchColor(
				@RequestParam(required = false) String color);
	
		
		//@formatter:on
		
		
		
		
		// Method for Drivetrain
		
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
						name = "Drivetrain",  
						required = false, 
						description = "Drivetrain Needed for a Bike"),
			}
		)
		@GetMapping(value = "/fetchTrekBikes")
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);

		List<Drivetrain> fetchDrivetrain(
				@RequestParam(required = false) String drivetrain);	
		
		//@formatter:on
		
		
		
		// Method for handlebar
		
		
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
						name = "Handlebar",  
						required = false, 
						description = "Handlebar Needed for a Bike"),
			}
		)
		@GetMapping(value = "/fetchTrekBikes")
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);

		List<Handlebar> fetchHandlebar(
				@RequestParam(required = false) String handlebar);	
		
		//@formatter:on
		
		
		// Method for Saddle
		
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
						name = "Saddle",  
						required = false, 
						description = "Saddle Needed for a Bike"),			
			}
		)
		@GetMapping(value = "/fetchTrekBikes")
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);

		List<Saddle> fetchSaddle(
				@RequestParam(required = false) String saddle);	
		
		//@formatter:on
		
		
		// Method for Tire
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
						name = "Tire",  
						required = false, 
						description = "Tires Needed for a Bike")
			}
		)
		@GetMapping(value = "/fetchTrekBikes")
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);

		List<Tire> fetchTire(
				@RequestParam(required = false) String tire);	
		
		//@formatter:on
		
//		// Method for Bike
//		//@formatter:off
//		@Operation(
//			summary = "Returns a list of Bikes",
//			description = "Returns a list of Bikes",
//			responses = {
//				
//				@ApiResponse(responseCode = "200", 
//						description = "The list of Bikes is returned", 
//						content = @Content(
//						mediaType = "application/json", 
//						schema = @Schema(
//						implementation = TrekBikes.class))),
//				
//				@ApiResponse(responseCode = "400", 
//						description = "The request parameters are invalid", 
//						content = @Content(
//						mediaType = "application/json")),
//				
//				@ApiResponse(responseCode = "404",  
//						description = "No Bikes were found with the input criteria", 
//						content = @Content(
//						mediaType = "application/json")),
//				
//				@ApiResponse(responseCode = "500",  
//						description = "An unplanned error occured.", 
//						content = @Content(
//						mediaType = "application/json"))
//			},
//	//Do i need a parameter for each Entity???		
//			parameters = { 
//				@Parameter(
//						name = "Bike",  
//						required = false, 
//						description = "The Bike")
//			}
//		)
//		@GetMapping(value = "/fetchTrekBikes")
//		@ResponseStatus(code = HttpStatus.OK)
////		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);
//
//		List<Bike> fetchBike(
//				@RequestParam(required = false) String bike);	
//		
//		//@formatter:on	
	}

