package com.mateo.liskov.substitution.bad;

public class PatoDeGoma extends Pato{
    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los patos de goma no vuelan");
    }

    @Override
    public void nadar() {
        System.out.println("Pato de goma nadando");
    }

    @Override
    public void hacerCuac() {
        System.out.println("Pato de goma haciendo cuac");
    }
}
