package org.example.enums;

public enum Seal {
    NONE(0.0),
    BRONZE(0.1),
    SILVER(0.15),
    GOLD(0.28);

    private final Double value;
    Seal(Double value) {
        this.value = value;
    }
    public Double getValue() {
        return value;
    }
}
