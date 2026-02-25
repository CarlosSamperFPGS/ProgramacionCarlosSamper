package POO3.Ataques;

public class AtaqueMagicoFisico implements Ataque {

    // Atributos
    private AtaqueMagico ataqueMagico;
    private AtaqueFisico ataqueFisico;

    // Constructor completo
    public AtaqueMagicoFisico(AtaqueMagico ataqueMagico, AtaqueFisico ataqueFisico) {
        this.ataqueMagico = ataqueMagico;
        this.ataqueFisico = ataqueFisico;
    }

    // Constructor Vacio
    public AtaqueMagicoFisico() {
        this.ataqueMagico = new AtaqueMagico();
        this.ataqueFisico = new AtaqueFisico();
    }

    // Setters y Getters
    public AtaqueMagico getAtaqueMagico() {
        return ataqueMagico;
    }

    public void setAtaqueMagico(AtaqueMagico ataqueMagico) {
        this.ataqueMagico = ataqueMagico;
    }

    public AtaqueFisico getAtaqueFisico() {
        return ataqueFisico;
    }

    public void setAtaqueFisico(AtaqueFisico ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    // Implementación de Ataque
    @Override
    public void lanzar() {
        System.out.println("¡Lanzando ataque combinado Mágico y Físico!");
        ataqueMagico.lanzar();
        ataqueFisico.lanzar();
    }

    @Override
    public double coste() {
        return ataqueMagico.coste() + ataqueFisico.coste();
    }

    @Override
    public double danioInfligido() {
        return ataqueMagico.danioInfligido() + ataqueFisico.danioInfligido();
    }

    // toString
    @Override
    public String toString() {
        return "Ataque Híbrido (Coste Total: " + coste() + ", Daño Total: " + danioInfligido() + ")";
    }
}
