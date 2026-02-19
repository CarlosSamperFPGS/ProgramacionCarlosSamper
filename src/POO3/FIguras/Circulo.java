package POO3.FIguras;

public class Circulo extends Figura2D {

    // Atributos
    private double radio;

    // Constantes Default
    private static final double DEFAULT_RADIO = 1.0;

    // Constructor completo
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Constructor Vacio
    public Circulo() {
        super();
        this.nombre = "Círculo";
        this.radio = DEFAULT_RADIO;
    }

    // Setters y Getters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación de métodos abstractos
    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Radio: " + radio;
    }
}
