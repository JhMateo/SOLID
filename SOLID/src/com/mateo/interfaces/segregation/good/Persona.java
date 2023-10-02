package com.mateo.interfaces.segregation.good;

public class Persona {
    public void cortar(IHerramientaCorte herramienta) {
        herramienta.cortar();
    }
    public void limar(IHerramientaLimado herramienta) {
        herramienta.limar();
    }
}
