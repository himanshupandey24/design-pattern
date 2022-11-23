package org.example.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.setName("Crow1");
        bird1.setColor("Black");
        bird1.setWeight(12);

        Sparrow sparrow = new Sparrow();
        sparrow.setColor("Grey");
        sparrow.setLegSize("5");

        Crow crow = new Crow();
        crow.setSound("Kooooooo");

        List<Bird> birds = List.of(
                bird1,
                sparrow,
                crow);

        List<Bird> children = new ArrayList<>();

        for (Bird parents : birds) {
            children.add(parents.clone());
        }

        for (Bird child : children) {
            child.setName("I'm a copy");
        }

        Sparrow longLeggedSparrow = new Sparrow();
        longLeggedSparrow.setLegSize("hundred");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("kookoo");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetSoundCrow", sweetSoundCrow);
        birdRegistry.registerBird("longLeggedSparrow", longLeggedSparrow);

        List<String> getBirdOfTypes = List.of(
                "sweetSoundCrow",
                "longLeggedSparrow",
                "sweetSoundCrow"
        );

        List<Bird> requestedBirds = new ArrayList<>();

        for (String type: getBirdOfTypes) {
            requestedBirds.add(birdRegistry.getBird(type));
        }

        System.out.println("Done");
    }
}
