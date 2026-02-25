package Colecciones.RegistroAnimales;

public class Pajaro extends Avistamiento {

    // Atributos
    private double peso;
    private String especie;

    // Constantes Default
    private static final double DEFAULT_PESO = 0.5;
    private static final String DEFAULT_ESPECIE = "Desconocida";

    // Constructor completo
    public Pajaro(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    // Constructor Vacio
    public Pajaro() {
        super();
        this.peso = DEFAULT_PESO;
        this.especie = DEFAULT_ESPECIE;
    }

    // Setters y Getters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Pájaro (Especie: " + especie + ", Peso: " + peso + "kg)";
    }
}
