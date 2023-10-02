package com.mateo.liskov.substitution.good;

public class PatoDeGoma implements INadar, IHacerCuac{
    @Override
    public void nadar() {
        System.out.println("Pato de goma nadando");
    }

    @Override
    public void hacerCuac() {
        System.out.println("Pato de goma haciendo cuac");
    }
}
