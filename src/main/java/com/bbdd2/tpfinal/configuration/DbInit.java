package com.bbdd2.tpfinal.configuration;

import com.bbdd2.tpfinal.model.Hotel;
import com.bbdd2.tpfinal.model.Room;
import com.bbdd2.tpfinal.repository.IAllowedHotelRepository;
import com.bbdd2.tpfinal.repository.IHotelRepository;
import com.bbdd2.tpfinal.repository.IRateRepository;
import com.bbdd2.tpfinal.repository.IRoomRepository;
import com.bbdd2.tpfinal.util.SamplerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static org.elasticsearch.index.query.QueryBuilders.*;


@Component
public class DbInit {

    private final IAllowedHotelRepository allowedHotelRepository;

    private final IHotelRepository hotelRepository;

    private final IRateRepository rateRepository;

    private final IRoomRepository roomRepository;

    @Autowired
    private ElasticsearchOperations elasticsearchRestTemplate;

    public DbInit(IAllowedHotelRepository allowedHotelRepository, IHotelRepository hotelRepository, IRateRepository rateRepository, IRoomRepository roomRepository) {
        this.allowedHotelRepository = allowedHotelRepository;
        this.hotelRepository = hotelRepository;
        this.rateRepository = rateRepository;
        this.roomRepository = roomRepository;
    }

    @PostConstruct
    private void initDb() {
        hotelRepository.save(SamplerBuilder.generateHotel());
        // Custom query
        Query searchQuery = new NativeSearchQueryBuilder()
                .withFilter(regexpQuery("title", ".*data.*"))
                .build();
        SearchHits<Hotel> articles =
                elasticsearchRestTemplate.search(searchQuery, Hotel.class, IndexCoordinates.of("blog"));


        Query searchQuery2 = new NativeSearchQueryBuilder()
                .withQuery(matchQuery("title", "articleTitle").minimumShouldMatch("75%"))
                .build();

        SearchHits<Room> articles2 =
                elasticsearchRestTemplate.search(searchQuery, Room.class, IndexCoordinates.of("blog"));
        Room room = articles2.getSearchHit(0).getContent();


        //elasticsearchRestTemplate.search()
    }
}