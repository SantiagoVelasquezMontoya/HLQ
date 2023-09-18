package org.example.models;

import org.example.enums.FlowerType;
import org.example.enums.Seal;

public class Bouquet {
    FlowerType flowerType;
    Seal seal;

    public Bouquet(FlowerType flowerType, Seal seal) {
        this.flowerType = flowerType;
        this.seal = seal;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public Seal getSeal() {
        return seal;
    }

    public void setSeal(Seal seal) {
        this.seal = seal;
    }
}
