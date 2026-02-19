package POO3.FIguras;

public class Triangulo extends Figura2D {

    // Atributos
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    // Constantes Default
    private static final double DEFAULT_BASE = 1.0;
    private static final double DEFAULT_ALTURA = 1.0;
    private static final double DEFAULT_LADO = 1.0;

    // Constructor completo
    public Triangulo(String nombre, double base, double altura, double lado1, double lado2) {
        super(nombre);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Constructor Vacio
    public Triangulo() {
        super();
        this.nombre = "Triángulo";
        this.base = DEFAULT_BASE;
        this.altura = DEFAULT_ALTURA;
        this.lado1 = DEFAULT_LADO;
        this.lado2 = DEFAULT_LADO;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    // Implementación de métodos abstractos
    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return base + lado1 + lado2;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Base: " + base + ", Altura: " + altura + ", Lados: " + lado1 + ", " + lado2;
    }
}
