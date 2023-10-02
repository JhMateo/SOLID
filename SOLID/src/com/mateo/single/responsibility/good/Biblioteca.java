package com.mateo.single.responsibility.good;

public class Biblioteca {
    public void guardarLibro(Libro libro, String codigoAlmacen) {
        System.out.println("El libro ha sido guardado en la biblioteca: " + codigoAlmacen);
    }

    public void prestarLibro(String codigoAlmacen) {
        System.out.println("El libro ha sido prestado: " + codigoAlmacen);
    }
}
