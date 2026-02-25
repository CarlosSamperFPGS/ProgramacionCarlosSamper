package POO3.Ataques;

public class AtaqueEspadazo implements AtaqueAvanzado {

    // Atributos
    private double fuerzaGolpe;

    // Constantes Default
    private static final double DEFAULT_FUERZA = 40.0;

    // Constructor completo
    public AtaqueEspadazo(double fuerzaGolpe) {
        this.fuerzaGolpe = fuerzaGolpe;
    }

    // Constructor Vacio
    public AtaqueEspadazo() {
        this.fuerzaGolpe = DEFAULT_FUERZA;
    }

    // Setters y Getters
    public double getFuerzaGolpe() {
        return fuerzaGolpe;
    }

    public void setFuerzaGolpe(double fuerzaGolpe) {
        this.fuerzaGolpe = fuerzaGolpe;
    }

    // Implementación de AtaqueAvanzado
    @Override
    public void lanzar() {
        System.out.println("¡Lanzando Espadazo!");
    }

    @Override
    public Coste coste() {
        // Cuesta mucho esfuerzo físico, nada de maná
        return new Coste(0.0, 15.0);
    }

    @Override
    public Danio danioInfligido() {
        // Daño puramente físico
        return new Danio(0.0, fuerzaGolpe);
    }

    // toString
    @Override
    public String toString() {
        return "Ataque Espadazo (Fuerza: " + fuerzaGolpe + ")";
    }
}
