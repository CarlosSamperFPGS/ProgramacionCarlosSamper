package Colecciones.RegistroAnimales;

public class MainParqueNatural {
    public static void main(String[] args) {
        RegistroAvistamientos registro = new RegistroAvistamientos();

        // Añadir avistamientos
        registro.anadirAvistamiento(new Serpiente(10, 1.5, "Cobra"));
        registro.anadirAvistamiento(new Pajaro(7, 0.2, "Gorrión"));
        registro.anadirAvistamiento(new ManadaLobos(22, 5, "Cazando"));
        registro.anadirAvistamiento(new Serpiente(21, 2.0, "Boa"));
        registro.anadirAvistamiento(new Pajaro(15, 0.5, "Águila"));
        registro.anadirAvistamiento(new ManadaLobos(6, 3, "Durmiendo"));

        // Mostrar avistamientos a partir de las 8
        registro.mostrarAvistamientosDesdeLas8();

        // Mostrar avistamientos nocturnos
        registro.mostrarAvistamientosNocturnos();

        // Mostrar manadas
        registro.mostrarManadas();

        // Mostrar serpientes
        registro.mostrarSerpientes();

        // Mostrar pájaros
        registro.mostrarPajaros();
    }
}
