package com.mateo.interfaces.segregation.bad;

public class InicioISPBad {
    public static void main(String[] args) {
        NavajaSuiza navajaSuiza = new NavajaSuiza();
        Persona persona = new Persona();
        Persona persona2 = new Persona();

        persona.cortar(navajaSuiza);
        persona2.limar(navajaSuiza);

        // La navaja hace muchas cosas, pero no todas las cosas que hace son
        // necesarias para todas las personas que la usan. La persona conoce
        // más de lo que necesita de la navaja.
    }
}
