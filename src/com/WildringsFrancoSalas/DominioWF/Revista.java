package com.WildringsFrancoSalas.DominioWF;

public class Revista extends Recurso {
    public Revista(String nombre) {
        super(nombre);
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información específica de la revista: Tema, Número, etc.");
    }
}
