package POO3.Ataques;

public class Coste {
    private double mana;
    private double esfuerzoFisico;

    public Coste(double mana, double esfuerzoFisico) {
        this.mana = mana;
        this.esfuerzoFisico = esfuerzoFisico;
    }

    public double getMana() {
        return mana;
    }

    public double getEsfuerzoFisico() {
        return esfuerzoFisico;
    }

    @Override
    public String toString() {
        return "Mana: " + mana + ", Esfuerzo: " + esfuerzoFisico;
    }
}
