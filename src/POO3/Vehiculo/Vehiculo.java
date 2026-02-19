package POO3.Vehiculo;

public class Vehiculo {

    // Atributos
    protected String marca;
    protected String modelo;
    protected String matricula;

    // Constantes Default
    protected static final String DEFAULT_MARCA = "Desconocida";
    protected static final String DEFAULT_MODELO = "Desconocido";
    protected static final String DEFAULT_MATRICULA = "Sin Matrícula";

    // Constructor completo
    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    // Constructor Vacio
    public Vehiculo() {
        this.marca = DEFAULT_MARCA;
        this.modelo = DEFAULT_MODELO;
        this.matricula = DEFAULT_MATRICULA;
    }

    // Setters y Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    // toString
    @Override
    public String toString() {
        return "Vehículo: " + marca + " " + modelo + " [" + matricula + "]";
    }
}