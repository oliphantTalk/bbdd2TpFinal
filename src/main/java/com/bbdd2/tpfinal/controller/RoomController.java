package com.bbdd2.tpfinal.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bbdd2.tpfinal.model.RoomConfiguration;
import com.bbdd2.tpfinal.service.RoomService;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author nahuel.barrena on 7/4/21
 */
@RestController
public class RoomController {

	private final ObjectMapper objectMapper;
	private final RoomService roomService;

	public RoomController(ObjectMapper objectMapper, RoomService roomService) {
		this.objectMapper = objectMapper;
		this.roomService = roomService;
	}

	@ApiOperation(value = "", response = Object.class, tags = "RETRIEVE CONFIGURATION") @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 500, message = "Error") })
	@GetMapping(path = "/rooms") public ResponseEntity<RoomConfiguration> getSuccessReport(
			@RequestParam(name = "id", required = false) Long id ) {

		// Repensar porque nadie va a buscar por id (?
		return roomService.retrieveById(id).map(ResponseEntity::ok).orElse(ResponseEntity.badRequest().build());
	}

	@ApiOperation(value = "", response = String.class, tags = "CONFIGURATION") @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 500, message = "Error") })
	@PostMapping(path = "/rooms") public ResponseEntity<RoomConfiguration> saveConfigurations(
			@RequestBody RoomConfiguration configurations) {

		final RoomConfiguration result = roomService.save(configurations);
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(result);
	}



}
