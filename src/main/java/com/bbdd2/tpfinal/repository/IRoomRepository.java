package com.bbdd2.tpfinal.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.bbdd2.tpfinal.model.Room;

/**
 * @author nahuel.barrena on 7/4/21
 */
public interface IRoomRepository extends ElasticsearchRepository<Room, Long> {

	Room findByName(String name);

	/*@Query("{\"bool\": {\"must\": [{\"match\": {\"rooms.name\": \"?0\"}}]}}")
	Room findByNameCustomQuery(String name);*/
}
