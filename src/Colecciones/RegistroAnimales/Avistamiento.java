package Colecciones.RegistroAnimales;

public abstract class Avistamiento {

    // Atributos
    protected int hora; // 0 - 23

    // Constantes Default
    protected static final int DEFAULT_HORA = 0;

    // Constructor completo
    public Avistamiento(int hora) {
        this.hora = hora;
    }

    // Constructor Vacio
    public Avistamiento() {
        this.hora = DEFAULT_HORA;
    }

    // Setters y Getters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    // toString
    @Override
    public String toString() {
        return "Avistamiento [Hora: " + hora + ":00]";
    }
}
