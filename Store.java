package org.example;

import org.example.enums.Zone;

public class Store {
    String name;
    Double tax = 0.19;
    Zone zone;

    public Store(String name, Zone zone) {
        this.name = name;
        this.zone = zone;
    }
}
