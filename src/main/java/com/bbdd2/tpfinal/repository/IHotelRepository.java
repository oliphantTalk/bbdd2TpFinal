package com.bbdd2.tpfinal.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.bbdd2.tpfinal.model.Hotel;

/**
 * @author nahuel.barrena on 17/4/21
 */
public interface IHotelRepository extends ElasticsearchRepository<Hotel, Long> {
}
