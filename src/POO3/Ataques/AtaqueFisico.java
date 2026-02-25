package POO3.Ataques;

public class AtaqueFisico implements Ataque {

    // Atributos
    private double energiaCoste;
    private double fuerza;

    // Constantes Default
    private static final double DEFAULT_ENERGIA_COSTE = 5.0;
    private static final double DEFAULT_FUERZA = 15.0;

    // Constructor completo
    public AtaqueFisico(double energiaCoste, double fuerza) {
        this.energiaCoste = energiaCoste;
        this.fuerza = fuerza;
    }

    // Constructor Vacio
    public AtaqueFisico() {
        this.energiaCoste = DEFAULT_ENERGIA_COSTE;
        this.fuerza = DEFAULT_FUERZA;
    }

    // Setters y Getters
    public double getEnergiaCoste() {
        return energiaCoste;
    }

    public void setEnergiaCoste(double energiaCoste) {
        this.energiaCoste = energiaCoste;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    // Implementación de Ataque
    @Override
    public void lanzar() {
        System.out.println("Lanzando golpe físico contundente!");
    }

    @Override
    public double coste() {
        return energiaCoste;
    }

    @Override
    public double danioInfligido() {
        return fuerza * 1.2;
    }

    // toString
    @Override
    public String toString() {
        return "Ataque Físico (Coste: " + energiaCoste + " energía, Daño: " + danioInfligido() + ")";
    }
}
