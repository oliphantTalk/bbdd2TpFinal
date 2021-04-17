package com.bbdd2.tpfinal.repository;

import com.bbdd2.tpfinal.model.HotelConfiguration;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface HotelConfigRepository extends ElasticsearchRepository<HotelConfiguration, Long> {

        public HotelConfiguration findByName(String name);
}
