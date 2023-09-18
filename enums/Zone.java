package org.example.enums;

public enum Zone {
    NORTH(0.0173),
    SOUTH(0.0122);
    private final Double value;

    Zone(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
