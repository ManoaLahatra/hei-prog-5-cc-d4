package com.matimi;

public abstract class AbstractToyFactory {
    public static Toy makeToy(ToyFactory factory, PlayerType type) {
        if (type == PlayerType.CHILDREN) {
            return factory.makeForChildren();
        }

        return factory.makeForKids();
    }
}
