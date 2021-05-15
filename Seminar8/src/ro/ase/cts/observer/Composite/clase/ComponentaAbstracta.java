package ro.ase.cts.observer.Composite.clase;

public interface ComponentaAbstracta {
    void printareElement() ;
    void adaugareNod(ComponentaAbstracta componentaAbstracta) ;
    void stergeNod(ComponentaAbstracta componentaAbstracta) ;
    ComponentaAbstracta getNod(int pozitie) ;
}
