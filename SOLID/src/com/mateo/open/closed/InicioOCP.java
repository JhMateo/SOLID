package com.mateo.open.closed;

public class InicioOCP {

    public static void main(String[] args) {
        MetodoDePago tarjetaDeCredito = new TarjetaDeCredito();
        MetodoDePago nequi = new Nequi();

        double monto = 100.0;

        InicioOCP.procesarPago(tarjetaDeCredito, monto);
        InicioOCP.procesarPago(nequi, monto);
    }

    public static void procesarPago(MetodoDePago metodo, double monto) {
        metodo.realizarPago(monto);
    }
}
