package org.example.structural.decorator.interfaceImpl;

public class ChocolateScoop implements IceCreamCone {
    private IceCreamCone iceCreamCone;

    public ChocolateScoop(IceCreamCone iceCreamCone){
        this.iceCreamCone = iceCreamCone;
    }

    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 20;
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents() + " " + "Chocolate";
    }
}
