package com.bbdd2.tpfinal.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.bbdd2.tpfinal.model.Offer;

/**
 * @author nahuel.barrena on 17/4/21
 */
public interface IOfferRepository extends ElasticsearchRepository<Offer, Long> {
}
