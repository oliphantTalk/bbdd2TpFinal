package com.bbdd2.tpfinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.bbdd2.tpfinal.model.AllowedHotel;
import com.bbdd2.tpfinal.model.Hotel;
import com.bbdd2.tpfinal.model.RatePlan;
import com.bbdd2.tpfinal.model.Room;
import com.bbdd2.tpfinal.repository.IAllowedHotelRepository;
import com.bbdd2.tpfinal.repository.IHotelRepository;
import com.bbdd2.tpfinal.repository.IRateRepository;
import com.bbdd2.tpfinal.repository.IRoomRepository;
import com.google.common.collect.Lists;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Service
public class MainService {

	private final IRoomRepository roomRepository;
	private final IAllowedHotelRepository allowedHotelRepository;
	private final IHotelRepository hotelRepository;
	private final IRateRepository rateRepository;

	public MainService(IRoomRepository IRoomRepository, IAllowedHotelRepository allowedHotelRepository,
			IHotelRepository hotelRepository, IRateRepository rateRepository) {
		this.roomRepository = IRoomRepository;
		this.allowedHotelRepository = allowedHotelRepository;
		this.hotelRepository = hotelRepository;
		this.rateRepository = rateRepository;
	}

	public Room saveRoom(Room room) {
		return roomRepository.save(room);
	}

	public Optional<Room> findRoomById(Long id) {
		return roomRepository.findById(id);
	}

	public Hotel saveHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	public Optional<Hotel> findHotelById(Long id) {
		return hotelRepository.findById(id);
	}

	public RatePlan saveRate(RatePlan rate) {
		return rateRepository.save(rate);
	}

	public Optional<RatePlan> findRateById(Long id) {
		return rateRepository.findById(id);
	}

	public Object findAll() {
		return Lists.newArrayList(roomRepository.findAll());
	}

	public List<Long> getWhiteListedHotels() {
		return allowedHotelRepository.findById(1L).orElse(new AllowedHotel()).getWhitelistHotels();
	}

	public List<Long> getBlackListedHotels() {
		return allowedHotelRepository.findById(1L).orElse(new AllowedHotel()).getBlacklistHotels();
	}

}
