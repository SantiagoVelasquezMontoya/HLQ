package org.example.models;

import org.example.services.IDiscount;

public class ZonaSur implements IDiscount {
    private final Double discount = 0.0122;

    @Override
    public Double calculateDiscount(Double price){
        return price * discount;
    }

}
