package org.example.behavioural.obersver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Flipkart {
    private static Map<Events, List<Subscriber>> subscribersRegister = new HashMap<>();

    public static void registerSubscriber(Events events, Subscriber subscriber){
        if(!subscribersRegister.containsKey(events)){
            subscribersRegister.put(events, new ArrayList<>());
        }

        subscribersRegister.get(events).add(subscriber);
    }

    public static void unRegisterSubscriber(Events events, Subscriber subscriber){
        subscribersRegister.get(events).remove(subscriber);
    }

    public void notify(Events events, Order order){
        for(Subscriber subscriber : subscribersRegister.get(events)){
            subscriber.listen(events,order);
        }
    }

    public void placeOrder(Order order) {
        this.notify(Events.ORDER_PLACED, order);
    }
}
