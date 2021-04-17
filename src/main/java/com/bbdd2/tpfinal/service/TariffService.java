package com.bbdd2.tpfinal.service;

import com.bbdd2.tpfinal.model.TariffConfiguration;

import java.util.Optional;

public class TariffService {

    private TariffConfiguration tariffConfiguration;

    public TariffService(TariffConfiguration tariffConfiguration){
        this.tariffConfiguration = tariffConfiguration;
    }

    // queria probar buscar la tarifa y aplicarle el descuento pero no se porque
    // no me reconoce el findById , no entiendo pq en Room si
//    public TariffConfiguration retrieveWithSale(Long id){
//        return tariffConfiguration.findById(id);
//    }

}
