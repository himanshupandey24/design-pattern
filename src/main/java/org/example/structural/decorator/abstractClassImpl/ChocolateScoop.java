package org.example.structural.decorator.abstractClassImpl;

public class ChocolateScoop extends IceCreamCone{
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
