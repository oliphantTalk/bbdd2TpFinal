package com.bbdd2.tpfinal.repository;

import com.bbdd2.tpfinal.model.SalesConfiguration;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SalesConfigRepository extends ElasticsearchRepository<SalesConfiguration, Long> {
}
