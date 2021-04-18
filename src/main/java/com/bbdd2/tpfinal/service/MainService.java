package com.bbdd2.tpfinal.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.bbdd2.tpfinal.model.Hotel;
import com.bbdd2.tpfinal.model.Offer;
import com.bbdd2.tpfinal.model.Rate;
import com.bbdd2.tpfinal.model.Room;
import com.bbdd2.tpfinal.repository.*;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Service
public class MainService {

	private final IRoomRepository roomRepository;
	private final IAllowedHotelRepository allowedHotelRepository;
	private final IHotelRepository hotelRepository;
	private final IOfferRepository offerRepository;
	private final IRateRepository rateRepository;

	public MainService(IRoomRepository IRoomRepository, IAllowedHotelRepository allowedHotelRepository,
			IHotelRepository hotelRepository, IOfferRepository offerRepository, IRateRepository rateRepository) {
		this.roomRepository = IRoomRepository;
		this.allowedHotelRepository = allowedHotelRepository;
		this.hotelRepository = hotelRepository;
		this.offerRepository = offerRepository;
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

	public Offer saveOffer(Offer offer) {
		return offerRepository.save(offer);
	}

	public Optional<Offer> findOfferById(Long id) {
		return offerRepository.findById(id);
	}

	public Rate saveRate(Rate rate) {
		return rateRepository.save(rate);
	}

	public Optional<Rate> findRateById(Long id) {
		return rateRepository.findById(id);
	}


}
