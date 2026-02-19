package POO3.Vehiculo;

public class Camion extends Vehiculo {

    // Atributos
    private double pma; // Peso Máximo Autorizado en Kg
    private boolean mercanciaPeligrosa;

    // Constantes Default
    private static final double DEFAULT_PMA = 3500.0;
    private static final boolean DEFAULT_MERCANCIA_PELIGROSA = false;

    // Constructor completo
    public Camion(String marca, String modelo, String matricula, double pma, boolean mercanciaPeligrosa) {
        super(marca, modelo, matricula);
        this.pma = pma;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    // Constructor Vacio
    public Camion() {
        super();
        this.pma = DEFAULT_PMA;
        this.mercanciaPeligrosa = DEFAULT_MERCANCIA_PELIGROSA;
    }

    // Setters y Getters
    public double getPma() {
        return pma;
    }

    public boolean isMercanciaPeligrosa() {
        return mercanciaPeligrosa;
    }

    // toString
    @Override
    public String toString() {
        String peligro = mercanciaPeligrosa ? "Peligrosa" : "No peligrosa";
        return super.toString() + " | Camión (PMA: " + pma + "kg, Mercancía: " + peligro + ")";
    }
}
