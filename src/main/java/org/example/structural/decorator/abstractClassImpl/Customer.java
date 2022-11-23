package org.example.structural.decorator.abstractClassImpl;

public class Customer {

    // Chocobar: Blue Cone + 2 Choco Scoop
    // Vanilla: Blue Cone + 1 Vanilla

    public static void main(String[] args) {
        System.out.println("Customer Here");
        IceCreamCone doubleChocobar = new ChocolateScoop(new ChocolateScoop(new BlueCone()));
        IceCreamCone vanilla = new VanillaScoop(new BlueCone());

        IceCreamCone blueClone = new BlueCone();

        System.out.println(blueClone.getCost());
    }
}
