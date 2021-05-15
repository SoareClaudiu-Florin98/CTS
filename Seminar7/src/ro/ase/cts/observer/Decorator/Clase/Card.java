package ro.ase.cts.observer.Decorator.Clase;

public class Card implements CardBancar{
    private String titular ;
    @Override
    public void platestePOS() {
        System.out.println(this.titular+" a platit prin intermediul POS ului");

    }

    @Override
    public void platesteOnline() {
        System.out.println(this.titular+" a platit online");


    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Card(String titular) {
        this.titular = titular;
    }
}
