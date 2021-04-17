package com.bbdd2.tpfinal.repository;

import com.bbdd2.tpfinal.model.TariffConfiguration;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TariffConfigRepository extends ElasticsearchRepository<TariffConfiguration, Long> {

}
