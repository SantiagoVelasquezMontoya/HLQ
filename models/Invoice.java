package org.example.models;

public class Invoice {
    String storeName;
    String storeZone;
    Double grossPrice;
    Double tax;
    Double netPrice;

    public Invoice(String storeName, String storeZone, Double grossPrice, Double tax, Double netPrice) {
        this.storeName = storeName;
        this.storeZone = storeZone;
        this.grossPrice = grossPrice;
        this.tax = tax;
        this.netPrice = netPrice;
    }

    public String showcase(){
        return "Tienda: " + this.storeName + "\n" +
                "Zona: " + this.storeZone + "\n" +
                "Precio Bruto: $ " + this.grossPrice + "\n" +
                "IVA: $ " + this.tax + "\n" +
                "Precio Neto: $ " + this.netPrice + "\n";
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreZone() {
        return storeZone;
    }

    public void setStoreZone(String storeZone) {
        this.storeZone = storeZone;
    }

    public Double getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(Double grossPrice) {
        this.grossPrice = grossPrice;
    }


    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }
}
