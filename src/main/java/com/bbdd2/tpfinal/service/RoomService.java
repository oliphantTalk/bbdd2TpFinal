package com.bbdd2.tpfinal.service;

import org.springframework.stereotype.Service;
import com.bbdd2.tpfinal.model.RoomConfiguration;
import com.bbdd2.tpfinal.repository.RoomConfigRepository;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Service
public class RoomService {


	private final RoomConfigRepository roomConfigRepository;

	public RoomService(RoomConfigRepository roomConfigRepository) {
		this.roomConfigRepository = roomConfigRepository;
	}

	public RoomConfiguration save (RoomConfiguration roomConfiguration) {
		return roomConfigRepository.save(roomConfiguration);
	}



}
