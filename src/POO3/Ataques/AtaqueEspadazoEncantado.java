package POO3.Ataques;

public class AtaqueEspadazoEncantado implements AtaqueAvanzado {

    // Atributos
    private AtaqueEspadazo espadazo;
    private AtaqueBolaFuego magia;

    // Constructor completo
    public AtaqueEspadazoEncantado(AtaqueEspadazo espadazo, AtaqueBolaFuego magia) {
        this.espadazo = espadazo;
        this.magia = magia;
    }

    // Constructor Vacio
    public AtaqueEspadazoEncantado() {
        this.espadazo = new AtaqueEspadazo();
        this.magia = new AtaqueBolaFuego();
    }

    // Setters y Getters
    public AtaqueEspadazo getEspadazo() {
        return espadazo;
    }

    public void setEspadazo(AtaqueEspadazo espadazo) {
        this.espadazo = espadazo;
    }

    public AtaqueBolaFuego getMagia() {
        return magia;
    }

    public void setMagia(AtaqueBolaFuego magia) {
        this.magia = magia;
    }

    // Implementación de AtaqueAvanzado
    @Override
    public void lanzar() {
        System.out.println("¡Lanzando Espadazo Encantado!");
        espadazo.lanzar();
        magia.lanzar();
    }

    @Override
    public Coste coste() {
        Coste costeFisico = espadazo.coste();
        Coste costeMagico = magia.coste();
        // Sumamos los costes
        return new Coste(costeFisico.getMana() + costeMagico.getMana(),
                         costeFisico.getEsfuerzoFisico() + costeMagico.getEsfuerzoFisico());
    }

    @Override
    public Danio danioInfligido() {
        Danio danioFisico = espadazo.danioInfligido();
        Danio danioMagico = magia.danioInfligido();
        // Sumamos los daños
        return new Danio(danioFisico.getMagico() + danioMagico.getMagico(),
                         danioFisico.getFisico() + danioMagico.getFisico());
    }

    // toString
    @Override
    public String toString() {
        return "Ataque Espadazo Encantado (Combina Espadazo y Bola de Fuego)";
    }
}
