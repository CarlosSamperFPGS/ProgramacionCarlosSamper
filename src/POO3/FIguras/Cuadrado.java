package POO3.FIguras;

public class Cuadrado extends Rectangulo {

    // Constantes Default
    private static final double DEFAULT_LADO = 1.0;

    // Constructor completo
    public Cuadrado(String nombre, double lado) {
        super(nombre, lado, lado);
    }

    // Constructor Vacio
    public Cuadrado() {
        super();
        this.nombre = "Cuadrado";
        this.base = DEFAULT_LADO;
        this.altura = DEFAULT_LADO;
    }

    // Setters y Getters
    public double getLado() {
        return base; // En un cuadrado, base y altura son iguales
    }

    public void setLado(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    // toString
    @Override
    public String toString() {
        return "Figura: " + nombre + " | Lado: " + base;
    }
}
