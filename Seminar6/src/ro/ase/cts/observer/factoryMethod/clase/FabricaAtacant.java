package ro.ase.cts.observer.factoryMethod.clase;

public class FabricaAtacant implements FabricaJucatori{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {

        return new Atacant(nume, nrTricou);
    }
}
