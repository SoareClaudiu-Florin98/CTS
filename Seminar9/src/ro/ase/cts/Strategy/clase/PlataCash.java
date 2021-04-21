package ro.ase.cts.Strategy.clase;

public class PlataCash implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A fos realizata o plata cash in valoare de "+suma+" lei");

    }
}
