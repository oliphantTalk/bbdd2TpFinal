package com.bbdd2.tpfinal.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.bbdd2.tpfinal.model.RoomConfiguration;

/**
 * @author nahuel.barrena on 7/4/21
 */
public interface RoomConfigRepository extends ElasticsearchRepository<RoomConfiguration, Long> {

    public RoomConfiguration findByNumber(Long number);
}
