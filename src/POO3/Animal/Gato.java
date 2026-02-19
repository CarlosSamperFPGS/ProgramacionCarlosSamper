package POO3.Animal;

public class Gato extends Animal {

    // Atributos
    private boolean tienePeloLargo;

    // Constantes Default
    private static final boolean DEFAULT_TIENE_PELO_LARGO = false;

    // Constructor completo
    public Gato(String nombre, int edad, boolean tienePeloLargo) {
        super(nombre, edad);
        this.tienePeloLargo = tienePeloLargo;
    }

    // Constructor Vacio
    public Gato() {
        super();
        this.tienePeloLargo = DEFAULT_TIENE_PELO_LARGO;
    }

    // Setters y Getters
    public boolean isTienePeloLargo() {
        return tienePeloLargo;
    }

    // Implementación de hacerRuido
    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    // Método único
    public void ronronear() {
        System.out.println(nombre + " está ronroneando.");
    }

    // toString
    @Override
    public String toString() {
        String pelo = tienePeloLargo ? "Largo" : "Corto";
        return super.toString() + " | Gato (Pelo: " + pelo + ")";
    }
}
