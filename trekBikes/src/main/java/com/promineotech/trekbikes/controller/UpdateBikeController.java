package com.promineotech.trekbikes.controller;

public interface UpdateBikeController {
	//Updates Bike

//	//updateCastMember()
//		// @formatter:off
//		@Operation(
//			summary = "Updates a cast member",
//			description = "Updates a cast member's information",
//			responses = {
//				@ApiResponse(
//					responseCode = "200",
//					description = "Cast member information was updated successfully.",
//					content = @Content(
//						mediaType = "application/json",
//						schema = @Schema(implementation = CastMember.class))),
//				@ApiResponse(
//					responseCode = "400",
//					description = "Invalid request parameters",
//					content = @Content(
//						mediaType = "application/json")),
//				@ApiResponse(
//					responseCode = "404",
//					description = "Unable to update cast member with the information given",
//					content = @Content(
//						mediaType = "application/json")),
//				@ApiResponse(
//					responseCode = "500",
//					description = "An unplanned error has occurred.",
//					content = @Content(
//						mediaType = "application/json"))
//			},
//				
//			parameters = {
//				@Parameter(
//					name = "firstName",
//					allowEmptyValue = false,
//					required = true,
//					description = "Cast member's first name"),
//				@Parameter(
//					name = "lastName",
//					allowEmptyValue = false,
//					required = true,
//					description = "Cast member's last name"),
//				@Parameter(
//					name = "newFirstName",
//					allowEmptyValue = false,
//					required = true,
//					description = "Cast member's updated first name"),
//				@Parameter(
//					name = "newLastName",
//					allowEmptyValue = false,
//					required = true,
//					description = "Cast member's updated last name"),
//				@Parameter(
//					name = "phoneNumber",
//					allowEmptyValue = false,
//					required = true,
//					description = "Phone Number"),
//				@Parameter(
//					name = "tapPerformer",
//					allowEmptyValue = false,
//					required = true,
//					description = "Member of tap troupe?"),
//				@Parameter(
//					name = "costumeComplete",
//					allowEmptyValue = false,
//					required = true,
//					description = "Costume complete?")
//			}
//		)
//
//		@PutMapping
//		@ResponseStatus(code = HttpStatus.OK)
//		Optional<CastMember> updateCastMember(
//			@RequestParam(required = true)
//			String firstName,
//			@RequestParam(required = true)
//			String lastName,
//			@RequestParam(required = true)
//			String newFirstName,
//			@RequestParam(required = true)
//			String newLastName,
//			@RequestParam(required = true)
//			String phoneNumber,
//			@RequestParam(required = true)
//			Boolean tapPerformer,
//			@RequestParam(required = true)
//			Boolean costumeComplete);
//		// @formatter:on
}
