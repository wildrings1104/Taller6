package com.WildringsFrancoSalas.AppWF;

import com.WildringsFrancoSalas.DominioWF.*;

public class Aplicacion {
        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();

            Libro libro = new Libro("Harry Potter");
            Tesis tesis = new Tesis("Tesis de Ciencia");
            Revista revista = new Revista("National Geographic");

            biblioteca.agregarRecurso(libro);
            biblioteca.agregarRecurso(tesis);
            biblioteca.agregarRecurso(revista);

            biblioteca.mostrarRecursos();

            biblioteca.prestarRecurso((Prestable) libro);
            biblioteca.mostrarRecursos();

            biblioteca.devolverRecurso((Prestable) libro);
            biblioteca.mostrarRecursos();
        }
}
