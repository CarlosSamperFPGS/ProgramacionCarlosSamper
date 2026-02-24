package POO3.Animal;

public abstract class Animal {

    // Atributos
    protected String nombre;
    protected int edad;

    // Constantes Default
    protected static final String DEFAULT_NOMBRE = "Sin Nombre";
    protected static final int DEFAULT_EDAD = 0;

    // Constructor completo
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor Vacio XS
    public Animal() {
        this.nombre = DEFAULT_NOMBRE;
        this.edad = DEFAULT_EDAD;
    }

    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Métodos comunes
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    // Métodos abstracto para obligar a las subclases a implementarlo
    public abstract void hacerRuido();

    // toString
    @Override
    public String toString() {
        return "Animal: " + nombre + " (" + edad + " años)";
    }
}
