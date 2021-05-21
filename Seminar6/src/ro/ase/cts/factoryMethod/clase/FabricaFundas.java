package ro.ase.cts.factoryMethod.clase;

public class FabricaFundas  implements FabricaJucatori{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Fundas(nume,nrTricou);
    }
}
