package com.mateo.interfaces.segregation.good;

public class Navaja implements IHerramientaCorte{
    @Override
    public void cortar() {
        System.out.println("Cortando...");
    }
}
