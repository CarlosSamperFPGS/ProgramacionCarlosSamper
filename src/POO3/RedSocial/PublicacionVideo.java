package POO3.RedSocial;

public class PublicacionVideo implements PublicacionConReaccion, AbrirPublicacion {

    // Atributos
    private String urlVideo;
    private int duracionSegundos;

    // Constantes Default
    private static final String DEFAULT_URL = "https://example.com/default.mp4";
    private static final int DEFAULT_DURACION = 0;

    // Constructor completo
    public PublicacionVideo(String urlVideo, int duracionSegundos) {
        this.urlVideo = urlVideo;
        this.duracionSegundos = duracionSegundos;
    }

    // Constructor Vacio
    public PublicacionVideo() {
        this.urlVideo = DEFAULT_URL;
        this.duracionSegundos = DEFAULT_DURACION;
    }

    // Setters y Getters
    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    // Implementación de Publicacion
    @Override
    public void publicar() {
        System.out.println("Publicando video: " + urlVideo + " (" + duracionSegundos + "s)");
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo video: " + urlVideo);
    }

    // Implementación de PublicacionConReaccion
    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en video: " + comentario);
    }

    // Implementación de AbrirPublicacion
    @Override
    public void abrir() {
        System.out.println("Reproduciendo video: " + urlVideo);
    }

    // toString
    @Override
    public String toString() {
        return "Publicación de Video: " + urlVideo + " | " + duracionSegundos + "s";
    }
}
