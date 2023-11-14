package com.WildringsFrancoSalas.DominioWF;

public class Libro extends Recurso {
    public Libro(String nombre) {
        super(nombre);
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado: " + nombre);
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto: " + nombre);
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información específica del libro: Autor, Género, etc.");
    }
}
