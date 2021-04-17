package com.bbdd2.tpfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bbdd2.tpfinal.model.RoomConfiguration;
import com.bbdd2.tpfinal.repository.RoomConfigRepository;

import java.util.Optional;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Service // componente que se instancia solo por spring , singleton
public class RoomService {

	//	@Autowired inicializacion automatica ponele
	private RoomConfigRepository roomConfigRepository;

	public RoomService(RoomConfigRepository roomConfigRepository) {
		this.roomConfigRepository = roomConfigRepository;
	}

	public RoomConfiguration save (RoomConfiguration roomConfiguration) {
		return roomConfigRepository.save(roomConfiguration);
	}

	public Optional<RoomConfiguration> retrieveById (Long id) {
		return roomConfigRepository.findById(id);
	}

	public RoomConfiguration retrieveByNumber (Long number) { return roomConfigRepository.findByNumber(number); }



}
