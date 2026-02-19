package POO3.Biblioteca;

public class Revista extends Ficha {

    // Atributos
    private int numeroPublicacion;
    private int anio;

    // Constantes Default
    private static final int DEFAULT_NUMERO_PUBLICACION = 0;
    private static final int DEFAULT_ANIO = 2023;

    // Constructor completo
    public Revista(int numero, String titulo, int numeroPublicacion, int anio) {
        super(numero, titulo);
        this.numeroPublicacion = numeroPublicacion;
        this.anio = anio;
    }

    // Constructor Vacio
    public Revista() {
        super();
        this.numeroPublicacion = DEFAULT_NUMERO_PUBLICACION;
        this.anio = DEFAULT_ANIO;
    }

    // Setters y Getters
    public int getNumeroPublicacion() {
        return numeroPublicacion;
    }

    public void setNumeroPublicacion(int numeroPublicacion) {
        this.numeroPublicacion = numeroPublicacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Revista (Nº Pub: " + numeroPublicacion + ", Año: " + anio + ")";
    }
}
