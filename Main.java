package org.example;

import org.example.enums.FlowerType;
import org.example.enums.Seal;
import org.example.enums.Zone;
import org.example.models.Bouquet;
import org.example.models.Invoice;
import org.example.models.ZonaNorte;
import org.example.models.ZonaSur;
import org.w3c.dom.html.HTMLQuoteElement;

public class Main {
    public static void main(String[] args) {
//        Bouquet bouquet = new Bouquet(FlowerType.TULIPANES, Seal.GOLD);
//
//        EdisonStore edisonStore = new EdisonStore("Edison Store", Zone.NORTH);
//        RosaStore rosaStore = new RosaStore("Rosa Store", Zone.SOUTH);
//
//        edisonStore.makePurchase(bouquet);
//        rosaStore.makePurchase(bouquet);
//
//        Invoice invoice = edisonStore.generateInvoice();
//
//        String result = invoice.showcase();
//        System.out.println(result);
        ZonaNorte miZona = new ZonaNorte();
        HLQStore edisonStore = new HLQStore(miZona);

        edisonStore.calcularAlgo(10000.0);



    }
}