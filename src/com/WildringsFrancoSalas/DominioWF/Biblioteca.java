package com.WildringsFrancoSalas.DominioWF;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
        private List<Recurso> recursos;

        public Biblioteca() {
            this.recursos = new ArrayList<>();
        }

        public void agregarRecurso(Recurso recurso) {
            recursos.add(recurso);
            System.out.println("Recurso agregado a la biblioteca: " + recurso.nombre);
        }

        public void prestarRecurso(Prestable prestable) {
            prestable.prestar();
        }

        public void devolverRecurso(Prestable prestable) {
            prestable.devolver();
        }

        public void mostrarRecursos() {
            System.out.println("Recursos en la biblioteca:");
            for (Recurso recurso : recursos) {
                System.out.println(recurso);
            }
        }
    }
