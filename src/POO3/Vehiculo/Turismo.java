package POO3.Vehiculo;

public class Turismo extends Vehiculo {

    // Atributos
    private int numPlazas;
    private tipoTurismo tipo;

    // Constantes Default
    private static final int DEFAULT_PLAZAS = 5;
    private final tipoTurismo DEFAULT_TIPO = tipoTurismo.PARTICULAR;

    // Constructor completo
    public Turismo(String marca, String modelo, String matricula, int numPlazas, tipoTurismo tipoUso) {
        super(marca, modelo, matricula);
        this.numPlazas = numPlazas;
        this.tipo = tipoUso;
    }

    // Constructor Vacio
    public Turismo() {
        super(); // Llama al constructor vacío de Vehiculo
        this.numPlazas = DEFAULT_PLAZAS;
        this.tipo = DEFAULT_TIPO;
    }

    // Setters y Getters
    public int getNumPlazas() {
        return numPlazas;
    }


    // toString
    @Override
    public String toString() {
        return super.toString() + " | Turismo (" + numPlazas + " plazas, Uso: " + tipo + ")";
    }
}
