package com.mateo.liskov.substitution.good;

public class InicioLSP {
    public static void main(String[] args) {
        ProcesadorPato procesadorPato = new ProcesadorPato();
        Pato pato = new Pato();
        PatoDeGoma patoDeGoma = new PatoDeGoma();

        procesadorPato.hacerCuac(pato);
        procesadorPato.hacerCuac(patoDeGoma);

        procesadorPato.hacerNadar(pato);
        procesadorPato.hacerNadar(patoDeGoma);

        procesadorPato.hacerVolar(pato);
        // Como el pato de goma no implementa la interfaz IVolar, no podremos
        // pasar un pato de goma y, por lo tanto, no violamos el
        // principio de sustitución de Liskov (LSP), ya que el programa no cambia su comportamiento.
    }
}
