package org.example.behavioural.strategy.before;

public class GoogleMaps {
    public void findPath(String from,
                         String to,
                         TransportModes mode) {

        if (mode == TransportModes.WALK) {
            System.out.println("Finding path for walking");
        } else if (mode == TransportModes.CAR) {
            System.out.println("Finding path for car");
        } else if (mode == TransportModes.BIKE) {
            System.out.println("Finding path for bike");
        }
    }
}
