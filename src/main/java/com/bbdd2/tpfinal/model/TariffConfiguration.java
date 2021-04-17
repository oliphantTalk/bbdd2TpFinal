package com.bbdd2.tpfinal.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.annotation.Id;

import java.util.List;


@Document(indexName = "tariff-config")
public class TariffConfiguration {

    @Id private long id;
    private long price;
    private List<String> paymentMethods;
    private SalesConfiguration sale;

    public TariffConfiguration(){
    }

    public TariffConfiguration(long id, long price, List<String> paymentMethods, SalesConfiguration sale){
        this.id = id;
        this.price = price;
        this.paymentMethods = paymentMethods;
        this.sale = sale;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public long getPrice() { return price; }

    public void setPrice(long price) { this.price = price; }

    public List<String> getPaymentMethods() { return paymentMethods; }

    public void setPaymentMethods(List<String> paymentMethods) { this.paymentMethods = paymentMethods; }

    // esto es necesario?
    public void addPaymentMethods(String paymentMethods) { this.paymentMethods.add(paymentMethods); }

    public SalesConfiguration getSale() {
        return sale;
    }

    public void setSale(SalesConfiguration sale) {
        this.sale = sale;
    }
}
