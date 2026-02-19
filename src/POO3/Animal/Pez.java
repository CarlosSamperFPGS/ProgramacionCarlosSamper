package POO3.Animal;

public class Pez extends Animal {

    // Atributos
    private tipoAgua tAgua;

    // Constantes Default
    private static final tipoAgua DEFAULT_TIPO_AGUA = tipoAgua.DULCE;

    // Constructor completo
    public Pez(String nombre, int edad, tipoAgua tAgua) {
        super(nombre, edad);
        this.tAgua = tAgua;
    }

    // Constructor Vacio
    public Pez() {
        super();
        this.tAgua = DEFAULT_TIPO_AGUA;
    }

    // Setters y Getters
    public String getTipoAgua() {
        return tAgua.toString();
    }

    // Implementación de hacerRuido
    @Override
    public void hacerRuido() {
        System.out.println(nombre + " hace: Glub glub.");
    }

    // Método único
    public void nadar() {
        System.out.println(nombre + " está nadando en agua " + tAgua + ".");
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Pez (Agua: " + tAgua + ")";
    }
}
