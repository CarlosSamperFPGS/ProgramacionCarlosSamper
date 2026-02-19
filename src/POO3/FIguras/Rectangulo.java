package POO3.FIguras;

public class Rectangulo extends Figura2D {

    // Atributos
    protected double base;
    protected double altura;

    // Constantes Default
    protected static final double DEFAULT_BASE = 1.0;
    protected static final double DEFAULT_ALTURA = 1.0;

    // Constructor completo
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Constructor Vacio
    public Rectangulo() {
        super();
        this.nombre = "Rectángulo";
        this.base = DEFAULT_BASE;
        this.altura = DEFAULT_ALTURA;
    }

    // Setters y Getters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementación de métodos abstractos
    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Base: " + base + ", Altura: " + altura;
    }
}
