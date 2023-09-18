package org.example.models;

import org.example.services.IDiscount;

public class ZonaNorte implements IDiscount {
    private final Double discount = 0.0173;

    @Override
    public Double calculateDiscount(Double price){
        return price * discount;
    }

}
