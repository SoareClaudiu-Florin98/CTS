package ro.ase.cts.Strategy.clase;

public class PlataBonuriMasa implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A fost platita o plata cu bonuri de masa in val de "+suma+" lei");
    }
}
