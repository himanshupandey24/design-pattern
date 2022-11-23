package org.example.behavioural.strategy.after.registerImpl;

public class Main {
    public static void main(String[] args) {

        PathCalculationStrategyRegister pathCalculationStrategyRegistry = new PathCalculationStrategyRegister();
        pathCalculationStrategyRegistry.registerStrategy(
                TransportModes.CAR, new CarPathCalculationStrategy()
        );
        pathCalculationStrategyRegistry.registerStrategy(
                TransportModes.BIKE, new BikePathCalculationStrategy()
        );
        pathCalculationStrategyRegistry.registerStrategy(
                TransportModes.WALK, new WalkPathCalculationStrategy()
        );

        GoogleMaps googleMaps = new GoogleMaps(pathCalculationStrategyRegistry);

        // // /findPath?from={}&to={}&mode=CAR
        googleMaps.findPath("Delhi", "Lucknow", TransportModes.CAR);
    }
}
