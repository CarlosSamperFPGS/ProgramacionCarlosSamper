package POO3.Animal;

public class Caballo extends Animal {

    // Atributos
    private double velocidadMaxima;

    // Constantes Default
    private static final double DEFAULT_VELOCIDAD_MAXIMA = 40.0;

    // Constructor completo
    public Caballo(String nombre, int edad, double velocidadMaxima) {
        super(nombre, edad);
        this.velocidadMaxima = velocidadMaxima;
    }

    // Constructor Vacio
    public Caballo() {
        super();
        this.velocidadMaxima = DEFAULT_VELOCIDAD_MAXIMA;
    }

    // Setters y Getters
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Implementación de hacerRuido
    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Hiii!");
    }

    // Método único
    public void galopar() {
        System.out.println(nombre + " está galopando a " + velocidadMaxima + " km/h.");
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Caballo (Velocidad Máx: " + velocidadMaxima + " km/h)";
    }
}
