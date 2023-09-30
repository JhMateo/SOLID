package com.mateo.single.responsibility.bad;

public class Libro {
    private String titulo;
    private String autor;
    private String fechaPublicacion;

    public Libro(String titulo, String autor, String fechaPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de Publicación: " + fechaPublicacion);
    }

    public void guardarLibro(Libro libro, String codigoAlmacen) {
        System.out.println("El libro ha sido guardado en la biblioteca: " + codigoAlmacen);
    }

    public void prestarLibro(String codigoAlmacen) {
        System.out.println("El libro ha sido prestado: " + codigoAlmacen);
    }
}
