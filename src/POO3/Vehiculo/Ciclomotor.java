package POO3.Vehiculo;

public class Ciclomotor extends Vehiculo{

    // Atributos
    private int cilindrada; // cc

    // Constantes Default
    private static final int DEFAULT_CILINDRADA = 49;

    // Constructor completo
    public Ciclomotor(String marca, String modelo, String matricula, int cilindrada) {
        super(marca, modelo, matricula);
        this.cilindrada = cilindrada;
    }

    // Constructor Vacio
    public Ciclomotor() {
        super();
        this.cilindrada = DEFAULT_CILINDRADA;
    }

    // Metodos
    /**
     * Determina si necesita carnet.
     * @return true si la cilindrada es >= 125cc
     */
    public boolean necesitaCarnet() {
        return cilindrada >= 125;
    }

    // Setters y Getters
    public int getCilindrada() {
        return cilindrada;
    }

    // toString
    @Override
    public String toString() {
        String carnet = necesitaCarnet() ? "Sí" : "No";
        return super.toString() + " | Ciclomotor (" + cilindrada + "cc, Necesita Carnet: " + carnet + ")";
    }
}