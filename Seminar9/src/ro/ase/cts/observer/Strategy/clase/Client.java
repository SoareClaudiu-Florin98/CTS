package ro.ase.cts.observer.Strategy.clase;

public class Client{
    private String numeClient;
    private Payable plata ;

    public Client(String numeClient, Payable plata) {
        this.numeClient = numeClient;
        this.plata = plata;
    }

    public void setPlata(Payable plata) {
        this.plata = plata;
    }
    public void platesteNota(float suma){
        System.out.println(this.numeClient+" are de realizat o plata");
        this.plata.pay(suma);
    }
}
