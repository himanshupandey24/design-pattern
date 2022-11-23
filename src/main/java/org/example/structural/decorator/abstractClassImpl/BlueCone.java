package org.example.structural.decorator.abstractClassImpl;

import java.security.InvalidParameterException;

public class BlueCone extends IceCreamCone {

    public BlueCone(IceCreamCone iceCreamCone){
        if(iceCreamCone.getConstituents().contains("scoop"))
            throw new InvalidParameterException();
    }

    public BlueCone(){}

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getConstituents() {
        return "Blue Cone";
    }
}
