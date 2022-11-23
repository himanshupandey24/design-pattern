package org.example.behavioural.obersver;

public interface Subscriber<T> {
    void listen(Events events, T detail);
}
