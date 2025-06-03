package com.matimi;

public class Main {
    public static void main(String[] args) {
        Toy toy = AbstractToyFactory.makeToy(new CarFactory(), PlayerType.CHILDREN);
        System.out.println(toy.play());
    }
}
