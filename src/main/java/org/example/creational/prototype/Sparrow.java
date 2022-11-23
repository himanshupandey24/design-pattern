package org.example.creational.prototype;

public class Sparrow extends Bird{
    private String legSize;

    public Sparrow(){}

    public void setLegSize(String legSize) {
        this.legSize = legSize;
    }

    public Sparrow(Sparrow old){
        super(old);
        this.legSize = old.legSize;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
