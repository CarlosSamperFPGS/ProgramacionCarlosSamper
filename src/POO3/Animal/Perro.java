package POO3.Animal;

public class Perro extends Animal {

    // Atributos
    private String raza;

    // Constantes Default
    private static final String DEFAULT_RAZA = "Mestizo";

    // Constructor completo
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    // Constructor Vacio
    public Perro() {
        super();
        this.raza = DEFAULT_RAZA;
    }

    // Setters y Getters
    public String getRaza() {
        return raza;
    }

    // Implementación de hacerRuido
    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    // Método único
    public void pasear() {
        System.out.println(nombre + " está paseando felizmente.");
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Perro (Raza: " + raza + ")";
    }
}
