package com.WildringsFrancoSalas.DominioWF;

abstract class Recurso {
    protected String nombre;
    protected boolean prestado;

    public Recurso(String nombre) {
        this.nombre = nombre;
        this.prestado = false;
    }

    public abstract void prestar();

    public abstract void devolver();

    public abstract void mostrarInfo();

    @Override
    public String toString() {
        return "Recurso: " + nombre + ", Estado: " + (prestado ? "Prestado" : "Disponible");
    }
}
