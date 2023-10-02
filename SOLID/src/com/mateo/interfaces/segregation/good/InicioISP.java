package com.mateo.interfaces.segregation.good;

public class InicioISP {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona2 = new Persona();

        IHerramientaCorte navaja = new Navaja();
        IHerramientaLimado lima = new Lima();

        persona.cortar(navaja);
        persona2.limar(lima);

        // Ahora la persona solo realiza las acciones que necesita
        // y no tiene que conocer métodos que no va a utilizar.
    }
}
