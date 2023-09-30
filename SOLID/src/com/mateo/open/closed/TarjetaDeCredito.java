package com.mateo.open.closed;

public class TarjetaDeCredito implements MetodoDePago{
    public void realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con tarjeta de crédito.");
    }
}
