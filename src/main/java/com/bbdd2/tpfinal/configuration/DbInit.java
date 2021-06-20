package com.bbdd2.tpfinal.configuration;

import com.bbdd2.tpfinal.repository.IAllowedHotelRepository;
import com.bbdd2.tpfinal.repository.IHotelRepository;
import com.bbdd2.tpfinal.repository.IRateRepository;
import com.bbdd2.tpfinal.repository.IRoomRepository;
import com.bbdd2.tpfinal.util.SamplerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DbInit {

    private final IAllowedHotelRepository allowedHotelRepository;

    private final IHotelRepository hotelRepository;

    private final IRateRepository rateRepository;

    private final IRoomRepository roomRepository;

    public DbInit(IAllowedHotelRepository allowedHotelRepository, IHotelRepository hotelRepository, IRateRepository rateRepository, IRoomRepository roomRepository) {
        this.allowedHotelRepository = allowedHotelRepository;
        this.hotelRepository = hotelRepository;
        this.rateRepository = rateRepository;
        this.roomRepository = roomRepository;
    }

    @PostConstruct
    private void initDb() {
        hotelRepository.save(SamplerBuilder.generateHotel());
    }
}