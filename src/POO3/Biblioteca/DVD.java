package POO3.Biblioteca;

public class DVD extends Ficha {

    // Atributos
    private String director;
    private int year;
    private TipoDVD tipo;

    // Constantes Default
    private static final String DEFAULT_DIRECTOR = "Desconocido";
    private static final int DEFAULT_YEAR = 2000;
    private static final TipoDVD DEFAULT_TIPO = TipoDVD.OTRO;

    // Constructor completo
    public DVD(int numero, String titulo, String director, int year, TipoDVD tipo) {
        super(numero, titulo);
        this.director = director;
        this.year = year;
        this.tipo = tipo;
    }

    // Constructor Vacio
    public DVD() {
        super();
        this.director = DEFAULT_DIRECTOR;
        this.year = DEFAULT_YEAR;
        this.tipo = DEFAULT_TIPO;
    }

    // Setters y Getters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TipoDVD getTipo() {
        return tipo;
    }

    public void setTipo(TipoDVD tipo) {
        this.tipo = tipo;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | DVD (Director: " + director + ", Año: " + year + ", Tipo: " + tipo + ")";
    }
}
