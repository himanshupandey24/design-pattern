package org.example.behavioural.strategy.after.factoryImpl;

public class GoogleMaps {
    private PathCalculationStrategyFactory pathCalculationStrategyFactory = new PathCalculationStrategyFactory();
    public void findPath(String from, String to, TransportModes mode){
        PathCalculationStrategy pathCalculationStrategy
                = pathCalculationStrategyFactory.getPathCalculationStrategyForMode(mode);

        pathCalculationStrategy.calculatePath(from, to);
    }
}
