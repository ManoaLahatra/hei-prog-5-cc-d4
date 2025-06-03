package com.matimi;

public class CarFactory implements ToyFactory {
    @Override
    public Toy makeForKids() {
        return new LittleCarToy();
    }

    @Override
    public Toy makeForChildren() {
        return new MiddleCarToy();
    }
}
