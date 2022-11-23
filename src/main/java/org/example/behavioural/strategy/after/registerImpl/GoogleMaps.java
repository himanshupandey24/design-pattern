package org.example.behavioural.strategy.after.registerImpl;

import org.example.behavioural.strategy.after.registerImpl.PathCalculationStrategy;

public class GoogleMaps {
    private PathCalculationStrategyRegister pathCalculationStrategyRegister;

    public GoogleMaps(PathCalculationStrategyRegister register){
        this.pathCalculationStrategyRegister = register;
    }

    public void findPath(String from, String to, TransportModes mode){
        PathCalculationStrategy pathCalculationStrategy = pathCalculationStrategyRegister.get(mode);
        pathCalculationStrategy.calculatePath(from, to);
    }
}
