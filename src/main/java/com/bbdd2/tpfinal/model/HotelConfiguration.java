package com.bbdd2.tpfinal.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Document(indexName = "hotel-config")
public class HotelConfiguration {

    @Id
    private long id;
    private String name;
    private List<RoomConfiguration> rooms;

    public HotelConfiguration(){
    }

    public HotelConfiguration(long id, String name, List<RoomConfiguration> rooms){
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomConfiguration> getRooms(){
        return rooms;
    }

    public void setRooms(List<RoomConfiguration> rooms) {
        this.rooms = rooms;
    }
}
