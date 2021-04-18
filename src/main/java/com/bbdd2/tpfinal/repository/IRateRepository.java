package com.bbdd2.tpfinal.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.bbdd2.tpfinal.model.Rate;

/**
 * @author nahuel.barrena on 17/4/21
 */
public interface IRateRepository extends ElasticsearchRepository<Rate, Long> {
}
