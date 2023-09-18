package org.example;

import org.example.enums.Zone;
import org.example.services.IDiscount;

public class HLQStore {
    IDiscount discount;

    public HLQStore(IDiscount discount) {
        this.discount = discount;
    }

    Double calcularAlgo(Double valorCompra){
        Double descuento = discount.calculateDiscount(valorCompra);
        System.out.println(descuento);
        return descuento;
    }

}
