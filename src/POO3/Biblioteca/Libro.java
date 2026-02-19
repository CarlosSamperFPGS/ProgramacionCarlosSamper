package POO3.Biblioteca;

public class Libro extends Ficha {

    // Atributos
    private String autor;
    private String editorial;

    // Constantes Default
    private static final String DEFAULT_AUTOR = "Anónimo";
    private static final String DEFAULT_EDITORIAL = "Sin Editorial";

    // Constructor completo
    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    // Constructor Vacio
    public Libro() {
        super();
        this.autor = DEFAULT_AUTOR;
        this.editorial = DEFAULT_EDITORIAL;
    }

    // Setters y Getters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " | Libro (Autor: " + autor + ", Editorial: " + editorial + ")";
    }
}
