package com.mateo.single.responsibility.bad;

public class InicioSRPBad {
    public static void main(String[] args) {
        Libro libro = new Libro("Don Quijote de la Mancha","Miguel de Cervantes","01/01/1605");
        libro.mostrarInformacion();

        libro.guardarLibro(libro, "6035592");
        libro.prestarLibro("6035592");
    }
}