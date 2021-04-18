package com.bbdd2.tpfinal.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bbdd2.tpfinal.model.Room;
import com.bbdd2.tpfinal.service.MainService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author nahuel.barrena on 7/4/21
 */
@RestController
public class MainController {

	private final MainService mainService;

	public MainController(MainService mainService) {
		this.mainService = mainService;
	}

	@ApiOperation(value = "", response = Object.class, tags = "WHITELIST REPORT")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 500, message = "Error")
		}
	)
	@GetMapping(path = "/room/{room_id}")
	public ResponseEntity<Room> getRoomById(
			@PathVariable(name = "room_id") Long roomId) {
		return mainService.findRoomById(roomId).map(ResponseEntity::ok).orElse(ResponseEntity.badRequest().build());
	}

	@ApiOperation(value = "", response = String.class, tags = "CONFIGURATION")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 500, message = "Error") }
	)
	@PostMapping(path = "/room")
	public ResponseEntity<Room> createRoom(@RequestBody Room room) {
		final Room result = mainService.saveRoom(room);
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(result);
	}

}
