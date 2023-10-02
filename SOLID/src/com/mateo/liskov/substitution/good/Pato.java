package com.mateo.liskov.substitution.good;

public class Pato implements IVolar, INadar, IHacerCuac {
    @Override
    public void volar() {
        System.out.println("Pato volando");
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadando");
    }

    @Override
    public void hacerCuac() {
        System.out.println("Pato haciendo cuac");
    }
}
