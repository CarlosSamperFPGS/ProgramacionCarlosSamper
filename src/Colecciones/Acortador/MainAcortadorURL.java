package Colecciones.Acortador;

public class MainAcortadorURL {
    public static void main(String[] args) {
        AcortadorURL acortador = new AcortadorURL();

        // Crear registros
        acortador.acortarURL("https://es.wikipedia.org/wiki/Wikipedia");
        acortador.acortarURL("https://www.google.com");
        acortador.acortarURL("https://www.stackoverflow.com");

        // Mostrar todos
        acortador.mostrarTodos();

        // Resolver dirección (simulado, ya que las claves son aleatorias, no podemos saberlas de antemano en este ejemplo estático)
        // En un caso real, el usuario introduciría la clave generada.
        // Para probar, vamos a asumir que el usuario copia una clave de la salida anterior.
        
        // Borrar un registro (simulado)
        // acortador.borrarRegistro("CLAVE_GENERADA");
        
        // Intentar borrar algo que no existe
        acortador.borrarRegistro("NOEXISTE");
    }
}
