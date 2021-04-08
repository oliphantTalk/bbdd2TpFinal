package com.bbdd2.tpfinal.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.format.annotation.DateTimeFormat;
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

	@ApiOperation(value = "", response = Object.class, tags = "WHITELIST REPORT") @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 500, message = "Error") })
	@GetMapping(path = "/rooms") public ResponseEntity<Object> getSuccessReport(
			@RequestParam(name = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
		return ResponseEntity.of(Optional.of(""));
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
