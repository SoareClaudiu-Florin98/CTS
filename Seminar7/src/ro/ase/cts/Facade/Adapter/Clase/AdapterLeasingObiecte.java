package ro.ase.cts.Facade.Adapter.Clase;

public class AdapterLeasingObiecte implements Creditable{
    private Leasing leasing ;

    public AdapterLeasingObiecte(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void Crediteaza() {
        this.leasing.oferaLeasing();
    }
}
