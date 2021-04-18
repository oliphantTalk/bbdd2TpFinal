package com.bbdd2.tpfinal.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.bbdd2.tpfinal.model.AllowedHotel;

/**
 * @author nahuel.barrena on 17/4/21
 */
public interface IAllowedHotelRepository extends ElasticsearchRepository<AllowedHotel, Long> {
}
