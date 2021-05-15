package ro.ase.cts.observer.Composite.clase;

public class Produs implements  ComponentaAbstracta{
    private String nume ;

    public Produs(String nume) {
        this.nume = nume;
    }

    @Override
    public void printareElement() {
        System.out.println("Proddus "+this.nume);

    }

    @Override
    public void adaugareNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException() ;

    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException() ;

    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        throw new UnsupportedOperationException() ;

    }
}
