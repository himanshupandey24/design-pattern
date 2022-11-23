package org.example.structural.decorator.interfaceImpl;

public class VanillaScoop implements IceCreamCone {

    private IceCreamCone iceCreamCone;


    public VanillaScoop(){}

    public VanillaScoop(IceCreamCone iceCreamCone){
        if(iceCreamCone == null)
            throw new NullPointerException();
    }

    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 15;
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents() + " " + "Vanilla";
    }
}
