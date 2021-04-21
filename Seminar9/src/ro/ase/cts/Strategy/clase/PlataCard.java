package ro.ase.cts.Strategy.clase;

public class PlataCard implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A fos realizata o plata card in valoare de "+suma+" lei");

    }
}
