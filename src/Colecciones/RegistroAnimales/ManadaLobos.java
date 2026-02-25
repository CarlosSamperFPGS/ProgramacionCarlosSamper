package Colecciones.RegistroAnimales;

public class ManadaLobos extends Avistamiento {

    // Atributos
    private int numeroLobos;
    private String observaciones;

    // Constantes Default
    private static final int DEFAULT_NUMERO = 5;
    private static final String DEFAULT_OBSERVACIONES = "Sin observaciones";

    // Constructor completo
    public ManadaLobos(int hora, int numeroLobos, String observaciones) {
        super(hora);
        this.numeroLobos = numeroLobos;
        this.observaciones = observaciones;
    }

    // Constructor Vacio
    public ManadaLobos() {
        super();
        this.numeroLobos = DEFAULT_NUMERO;
        this.observaciones = DEFAULT_OBSERVACIONES;
    }

    // Setters y Getters
    public int getNumeroLobos() {
        return numeroLobos;
    }

    public void setNumeroLobos(int numeroLobos) {
        this.numeroLobos = numeroLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Manada de Lobos (Nº: " + numeroLobos + ", Obs: " + observaciones + ")";
    }
}
