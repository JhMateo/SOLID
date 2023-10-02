package com.mateo.liskov.substitution.bad;

public class ProcesadorPato {
    public void hacerVolar(Pato pato) {
        try {
            pato.volar();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void hacerCuac(Pato pato) {
        try {
            pato.hacerCuac();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void hacerNadar(Pato pato) {
        try {
            pato.nadar();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
