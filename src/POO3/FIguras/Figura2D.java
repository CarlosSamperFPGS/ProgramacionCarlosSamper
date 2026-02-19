package POO3.FIguras;

public abstract class Figura2D {

    // Atributos
    protected String nombre;

    // Constantes Default
    protected static final String DEFAULT_NOMBRE = "Figura Desconocida";

    // Constructor completo
    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

    // Constructor Vacio
    public Figura2D() {
        this.nombre = DEFAULT_NOMBRE;
    }

    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract double area();
    public abstract double perimetro();

    // toString
    @Override
    public String toString() {
        return "Figura: " + nombre;
    }
}

