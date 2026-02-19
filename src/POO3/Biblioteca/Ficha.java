package POO3.Biblioteca;

public abstract class Ficha {

    // Atributos
    protected int numero;
    protected String titulo;
    protected boolean prestado;

    // Constantes Default
    protected static final int DEFAULT_NUMERO = 0;
    protected static final String DEFAULT_TITULO = "Sin Título";
    protected static final boolean DEFAULT_PRESTADO = false;

    // Constructor completo
    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
        this.prestado = DEFAULT_PRESTADO;
    }

    // Constructor Vacio
    public Ficha() {
        this.numero = DEFAULT_NUMERO;
        this.titulo = DEFAULT_TITULO;
        this.prestado = DEFAULT_PRESTADO;
    }

    // Setters y Getters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    // Métodos interesantes
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El elemento '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El elemento '" + titulo + "' ya está prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El elemento '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El elemento '" + titulo + "' no estaba prestado.");
        }
    }

    // toString
    @Override
    public String toString() {
        String estado = prestado ? "Prestado" : "Disponible";
        return "Ficha [Nº: " + numero + "] " + titulo + " (" + estado + ")";
    }
}
