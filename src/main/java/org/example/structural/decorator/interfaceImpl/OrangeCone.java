package org.example.structural.decorator.interfaceImpl;

public class OrangeCone implements IceCreamCone {
    @Override
    public int getCost() {
        return 6;
    }

    @Override
    public String getConstituents() {
        return "Orange Cone";
    }
}
