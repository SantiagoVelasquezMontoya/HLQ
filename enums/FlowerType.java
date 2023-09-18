package org.example.enums;

public enum FlowerType {
    TULIPANES(180000.0),
    GIRASOLES(110000.0),
    ROSAS(90000.0),
    CLAVEL(170000.0),
    CAMALOTE(128000.0);

    private final Double value;

    FlowerType(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
