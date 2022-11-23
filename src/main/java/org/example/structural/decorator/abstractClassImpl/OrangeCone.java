package org.example.structural.decorator.abstractClassImpl;

public class OrangeCone extends IceCreamCone{
    @Override
    public int getCost() {
        return 6;
    }

    @Override
    public String getConstituents() {
        return "Orange Cone";
    }
}
