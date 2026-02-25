package POO3.Ataques;

public class Danio {
    private double magico;
    private double fisico;

    public Danio(double magico, double fisico) {
        this.magico = magico;
        this.fisico = fisico;
    }

    public double getMagico() {
        return magico;
    }

    public double getFisico() {
        return fisico;
    }

    @Override
    public String toString() {
        return "Mágico: " + magico + ", Físico: " + fisico;
    }
}
