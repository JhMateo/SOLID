package com.mateo.liskov.substitution.bad;

public class InicioLSPBad {
    public static void main(String[] args) {
        ProcesadorPato procesadorPato = new ProcesadorPato();
        Pato pato = new Pato();
        Pato patoDeGoma = new PatoDeGoma();

        procesadorPato.hacerCuac(pato);
        procesadorPato.hacerCuac(patoDeGoma);

        procesadorPato.hacerNadar(pato);
        procesadorPato.hacerNadar(patoDeGoma);

        procesadorPato.hacerVolar(pato);
        procesadorPato.hacerVolar(patoDeGoma);
        // El programa cambia su comportamiento al pasar un pato de goma, ya que
        // el pato de goma no puede volar y, por lo tanto, violamos el
        // principio de sustitución de Liskov.
    }
}
