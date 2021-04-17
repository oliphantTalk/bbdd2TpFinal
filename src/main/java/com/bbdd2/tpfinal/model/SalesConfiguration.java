package com.bbdd2.tpfinal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "sales-config")
public class SalesConfiguration {

    @Id
    private long id;
    private long percentage;

    public SalesConfiguration(){
    }

    public SalesConfiguration(long id, long percentage){
        this.id = id;
        this.percentage = percentage;
    }

    public long getId(){ return id; }

    public void setId(long id){ this.id = id; }

    public long getPercentage() {
        return percentage;
    }

    public void setPercentage(long percentage) {
        this.percentage = percentage;
    }
}
