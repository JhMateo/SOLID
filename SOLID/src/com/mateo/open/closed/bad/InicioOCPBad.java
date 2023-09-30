package com.mateo.open.closed.bad;

public class InicioOCPBad {

    public static void main(String[] args) {
        ProcesadorDePagos procesador = new ProcesadorDePagos();

        procesador.procesarPago("TarjetaDeCredito", 100.0);
        procesador.procesarPago("Nequi", 100.0);
    }
}
