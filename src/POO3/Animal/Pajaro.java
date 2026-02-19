package POO3.Animal;

public class Pajaro extends Animal {

    // Atributos
    private boolean puedeVolar;

    // Constantes Default
    private static final boolean DEFAULT_PUEDE_VOLAR = true;

    // Constructor completo
    public Pajaro(String nombre, int edad, boolean puedeVolar) {
        super(nombre, edad);
        this.puedeVolar = puedeVolar;
    }

    // Constructor Vacio
    public Pajaro() {
        super();
        this.puedeVolar = DEFAULT_PUEDE_VOLAR;
    }

    // Setters y Getters
    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    // Implementación de hacerRuido
    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }

    // Método único
    public void construirNido() {
        System.out.println(nombre + " está construyendo un nido.");
    }

    // toString
    @Override
    public String toString() {
        String vuela = puedeVolar ? "Sí" : "No";
        return super.toString() + " | Pájaro (Vuela: " + vuela + ")";
    }
}
