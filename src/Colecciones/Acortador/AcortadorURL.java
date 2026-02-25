package Colecciones.Acortador;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AcortadorURL {

    // Atributos
    private Map<String, String> urlMap;
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LONGITUD_CLAVE = 5;

    // Constructor
    public AcortadorURL() {
        this.urlMap = new HashMap<>();
    }

    // Crear un nuevo registro
    public void acortarURL(String urlOriginal) {
        String clave = generarClaveUnica();
        urlMap.put(clave, urlOriginal);
        System.out.println("URL acortada creada: https://acortar.link/" + clave + " -> " + urlOriginal);
    }

    // Resolver dirección
    public void resolverURL(String clave) {
        if (urlMap.containsKey(clave)) {
            System.out.println("La clave " + clave + " redirige a: " + urlMap.get(clave));
        } else {
            System.out.println("No existe ninguna URL asociada a la clave: " + clave);
        }
    }

    // Borrar un registro
    public void borrarRegistro(String clave) {
        if (urlMap.containsKey(clave)) {
            String urlEliminada = urlMap.remove(clave);
            System.out.println("Registro eliminado: " + clave + " -> " + urlEliminada);
        } else {
            System.out.println("No se puede borrar. La clave " + clave + " no existe.");
        }
    }

    // Mostrar todos los registros
    public void mostrarTodos() {
        if (urlMap.isEmpty()) {
            System.out.println("No hay URLs acortadas registradas.");
        } else {
            System.out.println("--- Listado de URLs Acortadas ---");
            urlMap.forEach((clave, url) -> System.out.println("https://acortar.link/" + clave + " -> " + url));
        }
    }

    // Método privado para generar clave única aleatoria
    private String generarClaveUnica() {
        Random random = new Random();
        String clave;
        do {
            StringBuilder sb = new StringBuilder(LONGITUD_CLAVE);
            for (int i = 0; i < LONGITUD_CLAVE; i++) {
                int index = random.nextInt(CARACTERES.length());
                sb.append(CARACTERES.charAt(index));
            }
            clave = sb.toString();
        } while (urlMap.containsKey(clave)); // Asegurar que sea única
        return clave;
    }
}
