package org.example;

import org.example.enums.Zone;
import org.example.models.Bouquet;
import org.example.models.Invoice;
import org.example.services.IInvoiceService;
import org.example.services.IPurchaseService;

public class EdisonStore extends Store implements IPurchaseService, IInvoiceService {
    Invoice invoice;

    public EdisonStore(String name, Zone zone) {
        super(name, zone);
    }~

    @Override
    public void makePurchase(Bouquet bouquet) {
        Double grossPrice = bouquet.getFlowerType().getValue();
        Double taxedPrice = grossPrice + (grossPrice  * this.tax);
        Double taxValue = (grossPrice * this.tax);
        Double discountedPrice = taxedPrice - (taxedPrice * bouquet.getSeal().getValue()) - (taxedPrice * this.zone.getValue());
        this.invoice = new Invoice(this.name, this.zone.toString(), grossPrice, taxValue, discountedPrice);
    }



    @Override
    public Invoice generateInvoice() {
        if(this.zone == Zone.SOUTH){
            System.out.println("North zone stores cannot generate invoices");
            return null;
        }
        if (this.invoice != null) {
            return this.invoice;
        };
        throw new NullPointerException("No invoice generated, please make a purchase first");
    }
}

