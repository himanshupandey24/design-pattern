package org.example.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    private Map<String, Bird> birdsRegister = new HashMap<>();

    public void registerBird(String name, Bird bird) {
        birdsRegister.put(name, bird);
    }

    public Bird getBird(String name){
        return birdsRegister.get(name);
    }
}
