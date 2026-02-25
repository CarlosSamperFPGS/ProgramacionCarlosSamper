package Colecciones.RegistroAnimales;

public class Serpiente extends Avistamiento {

    // Atributos
    private double longitud;
    private String especie;

    // Constantes Default
    private static final double DEFAULT_LONGITUD = 1.0;
    private static final String DEFAULT_ESPECIE = "Desconocida";

    // Constructor completo
    public Serpiente(int hora, double longitud, String especie) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    // Constructor Vacio
    public Serpiente() {
        super();
        this.longitud = DEFAULT_LONGITUD;
        this.especie = DEFAULT_ESPECIE;
    }

    // Setters y Getters
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
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
        return super.toString() + " | Serpiente (Especie: " + especie + ", Longitud: " + longitud + "m)";
    }
}
