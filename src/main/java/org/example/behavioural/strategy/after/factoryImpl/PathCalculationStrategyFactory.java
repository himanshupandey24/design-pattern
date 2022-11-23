package org.example.behavioural.strategy.after.factoryImpl;

public class PathCalculationStrategyFactory {
    public PathCalculationStrategy getPathCalculationStrategyForMode(TransportModes mode){
        if(mode == TransportModes.WALK)
            return new WalkPathCalculationStrategy();
        else if(mode == TransportModes.BIKE)
            return new BikePathCalculationStrategy();
        else if(mode == TransportModes.CAR)
            return new CarPathCalculationStrategy();

        return null;
    }
}
