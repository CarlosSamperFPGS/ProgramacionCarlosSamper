package POO3.Ataques;

public class AtaqueBolaFuego implements AtaqueAvanzado {

    // Atributos
    private double potenciaFuego;

    // Constantes Default
    private static final double DEFAULT_POTENCIA = 50.0;

    // Constructor completo
    public AtaqueBolaFuego(double potenciaFuego) {
        this.potenciaFuego = potenciaFuego;
    }

    // Constructor Vacio
    public AtaqueBolaFuego() {
        this.potenciaFuego = DEFAULT_POTENCIA;
    }

    // Setters y Getters
    public double getPotenciaFuego() {
        return potenciaFuego;
    }

    public void setPotenciaFuego(double potenciaFuego) {
        this.potenciaFuego = potenciaFuego;
    }

    // Implementación de AtaqueAvanzado
    @Override
    public void lanzar() {
        System.out.println("¡Lanzando Bola de Fuego!");
    }

    @Override
    public Coste coste() {
        // Cuesta mucho maná, poco esfuerzo físico
        return new Coste(20.0, 2.0);
    }

    @Override
    public Danio danioInfligido() {
        // Daño puramente mágico
        return new Danio(potenciaFuego, 0.0);
    }

    // toString
    @Override
    public String toString() {
        return "Ataque Bola de Fuego (Potencia: " + potenciaFuego + ")";
    }
}
