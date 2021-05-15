package ro.ase.cts.observer.Adapter.Clase;

public class AdapterLeasingClase extends Leasing implements Creditable{
    public AdapterLeasingClase(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void Crediteaza() {
        super.oferaLeasing();
    }
}
