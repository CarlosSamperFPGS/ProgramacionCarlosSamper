package POO3.RedSocial;

public class PublicacionTexto implements PublicacionConReaccion {

    // Atributos
    private String contenido;

    // Constantes Default
    private static final String DEFAULT_CONTENIDO = "Sin contenido";

    // Constructor completo
    public PublicacionTexto(String contenido) {
        this.contenido = contenido;
    }

    // Constructor Vacio
    public PublicacionTexto() {
        this.contenido = DEFAULT_CONTENIDO;
    }

    // Setters y Getters
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    // Implementación de Publicacion
    @Override
    public void publicar() {
        System.out.println("Publicando texto: " + contenido);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo texto: " + contenido);
    }

    // Implementación de PublicacionConReaccion
    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en texto: " + comentario);
    }

    // toString
    @Override
    public String toString() {
        return "Publicación de Texto: " + contenido;
    }
}
