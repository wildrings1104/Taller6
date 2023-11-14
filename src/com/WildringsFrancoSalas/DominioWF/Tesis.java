package com.WildringsFrancoSalas.DominioWF;

public class Tesis extends Recurso {
    public Tesis(String nombre) {
        super(nombre);
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Tesis prestada: " + nombre);
        } else {
            System.out.println("La tesis ya está prestada.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Tesis devuelta: " + nombre);
        } else {
            System.out.println("La tesis no estaba prestada.");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información específica de la tesis: Autor, Fecha de publicación, etc.");
    }
}
