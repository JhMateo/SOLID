package com.mateo.open.closed;

public class Nequi implements MetodoDePago{
    public void realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con Nequi.");
    }
}
