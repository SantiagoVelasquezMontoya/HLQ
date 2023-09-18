package org.example;

import org.example.enums.Zone;
import org.example.models.Bouquet;
import org.example.services.IPurchaseService;

public class RosaStore extends Store implements IPurchaseService {

    public RosaStore(String name, Zone zone) {
        super(name, zone);
    }

    @Override
    public void makePurchase(Bouquet bouquet) {
        Double grossPrice = bouquet.getFlowerType().getValue();
        Double taxedPrice = grossPrice + (grossPrice  * this.tax);
        Double discountedPrice = taxedPrice - (taxedPrice * bouquet.getSeal().getValue()) - (taxedPrice * this.zone.getValue());
        System.out.println(this.name +" El precio final es : $ " + discountedPrice);
    }
}
