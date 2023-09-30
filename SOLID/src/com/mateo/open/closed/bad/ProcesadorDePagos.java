package com.mateo.open.closed.bad;

public class ProcesadorDePagos {
    public void procesarPago(String metodo, double monto) {
        if (metodo.equals("TarjetaDeCredito")) {
            System.out.println("Pago de $" + monto + " realizado con tarjeta de crédito.");
        } else if (metodo.equals("Nequi")) {
            System.out.println("Pago de $" + monto + " realizado con Nequi.");
        } else {
            System.out.println("Método de pago no válido.");
        }
    }
}
