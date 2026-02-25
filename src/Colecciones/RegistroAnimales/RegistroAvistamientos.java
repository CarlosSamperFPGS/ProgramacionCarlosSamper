package Colecciones.RegistroAnimales;

import java.util.ArrayList;
import java.util.List;

public class RegistroAvistamientos {

    // Atributos
    private List<Avistamiento> avistamientos;

    // Constructor
    public RegistroAvistamientos() {
        this.avistamientos = new ArrayList<>();
    }

    // Añadir avistamiento
    public void anadirAvistamiento(Avistamiento avistamiento) {
        avistamientos.add(avistamiento);
    }

    // Mostrar todos los avistamientos a partir de las 8 horas (>= 8)
    public void mostrarAvistamientosDesdeLas8() {
        System.out.println("Avistamientos a partir de las 8:00:");
        avistamientos.stream()
                .filter(a -> a.getHora() >= 8)
                .forEach(System.out::println);
    }

    // Mostrar todos los avistamientos nocturnos (entre las 20 y las 8)
    // Interpretación: >= 20 OR < 8
    public void mostrarAvistamientosNocturnos() {
        System.out.println("Avistamientos Nocturnos (20:00 - 8:00):");
        avistamientos.stream()
                .filter(a -> a.getHora() >= 20 || a.getHora() < 8)
                .forEach(System.out::println);
    }

    // Mostrar manadas
    public void mostrarManadas() {
        System.out.println("Manadas de Lobos:");
        avistamientos.stream()
                .filter(a -> a instanceof ManadaLobos)
                .forEach(System.out::println);
    }

    // Mostrar serpientes
    public void mostrarSerpientes() {
        System.out.println("Serpientes:");
        avistamientos.stream()
                .filter(a -> a instanceof Serpiente)
                .forEach(System.out::println);
    }

    // Mostrar pájaros
    public void mostrarPajaros() {
        System.out.println("Pájaros:");
        avistamientos.stream()
                .filter(a -> a instanceof Pajaro)
                .forEach(System.out::println);
    }
}
