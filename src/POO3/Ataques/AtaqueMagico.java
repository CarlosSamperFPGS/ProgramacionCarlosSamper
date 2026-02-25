package POO3.Ataques;

public class AtaqueMagico implements Ataque {

    // Atributos
    private double manaCoste;
    private double poderMagico;

    // Constantes Default
    private static final double DEFAULT_MANA_COSTE = 10.0;
    private static final double DEFAULT_PODER_MAGICO = 20.0;

    // Constructor completo
    public AtaqueMagico(double manaCoste, double poderMagico) {
        this.manaCoste = manaCoste;
        this.poderMagico = poderMagico;
    }

    // Constructor Vacio
    public AtaqueMagico() {
        this.manaCoste = DEFAULT_MANA_COSTE;
        this.poderMagico = DEFAULT_PODER_MAGICO;
    }

    // Setters y Getters
    public double getManaCoste() {
        return manaCoste;
    }

    public void setManaCoste(double manaCoste) {
        this.manaCoste = manaCoste;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    // Implementación de Ataque
    @Override
    public void lanzar() {
        System.out.println("Lanzando bola de fuego mágica!");
    }

    @Override
    public double coste() {
        return manaCoste;
    }

    @Override
    public double danioInfligido() {
        return poderMagico * 1.5;
    }

    // toString
    @Override
    public String toString() {
        return "Ataque Mágico (Coste: " + manaCoste + " maná, Daño: " + danioInfligido() + ")";
    }
}
