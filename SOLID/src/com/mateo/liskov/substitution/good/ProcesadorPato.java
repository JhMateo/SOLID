package com.mateo.liskov.substitution.good;

public class ProcesadorPato {
    // No podremos pasar un pato de goma a este método
    public void hacerVolar(IVolar pato) {
        pato.volar();
    }

    public void hacerCuac(IHacerCuac pato) {
        pato.hacerCuac();
    }

    public void hacerNadar(INadar pato) {
        pato.nadar();
    }
}
