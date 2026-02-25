package POO3.RedSocial;

public class PublicacionFoto implements PublicacionConReaccion, AbrirPublicacion {

    // Atributos
    private String urlImagen;
    private String descripcion;

    // Constantes Default
    private static final String DEFAULT_URL = "https://example.com/default.jpg";
    private static final String DEFAULT_DESCRIPCION = "Sin descripción";

    // Constructor completo
    public PublicacionFoto(String urlImagen, String descripcion) {
        this.urlImagen = urlImagen;
        this.descripcion = descripcion;
    }

    // Constructor Vacio
    public PublicacionFoto() {
        this.urlImagen = DEFAULT_URL;
        this.descripcion = DEFAULT_DESCRIPCION;
    }

    // Setters y Getters
    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Implementación de Publicacion
    @Override
    public void publicar() {
        System.out.println("Publicando foto: " + urlImagen + " (" + descripcion + ")");
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo foto: " + urlImagen);
    }

    // Implementación de PublicacionConReaccion
    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en foto: " + comentario);
    }

    // Implementación de AbrirPublicacion
    @Override
    public void abrir() {
        System.out.println("Abriendo foto en pantalla completa: " + urlImagen);
    }

    // toString
    @Override
    public String toString() {
        return "Publicación de Foto: " + urlImagen + " | " + descripcion;
    }
}
