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

    // Método abstracto para imprimir información específica del recurso
    public abstract void mostrarInfo();

    // Método toString para mostrar la información básica del recurso
    @Override
    public String toString() {
        return "Recurso: " + nombre + ", Estado: " + (prestado ? "Prestado" : "Disponible");
    }
}
