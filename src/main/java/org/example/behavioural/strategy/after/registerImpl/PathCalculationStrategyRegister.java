package org.example.behavioural.strategy.after.registerImpl;

import org.example.behavioural.strategy.after.registerImpl.PathCalculationStrategy;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegister {
    private Map<TransportModes, PathCalculationStrategy> strategyRegsiter = new HashMap<>();

    public void registerStrategy(TransportModes mode, PathCalculationStrategy strategy){
        strategyRegsiter.put(mode, strategy);
    }

    public PathCalculationStrategy get(TransportModes mode) {
        return strategyRegsiter.get(mode);
    }


}
