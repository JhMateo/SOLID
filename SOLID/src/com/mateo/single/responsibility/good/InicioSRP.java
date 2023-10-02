package com.mateo.single.responsibility.good;

public class InicioSRP {
    public static void main(String[] args) {
        Libro libro = new Libro("Don Quijote de la Mancha","Miguel de Cervantes","01/01/1605");
        libro.mostrarInformacion();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.guardarLibro(libro, "6035592");
        biblioteca.prestarLibro("6035592");
    }
}