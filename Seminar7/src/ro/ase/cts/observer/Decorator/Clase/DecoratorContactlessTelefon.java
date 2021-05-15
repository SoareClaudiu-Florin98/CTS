package ro.ase.cts.observer.Decorator.Clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract{
    public DecoratorContactlessTelefon(CardBancar card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCard()).getTitular()+ " a realizat o plata contactless cu telefonul!");
    }
}
