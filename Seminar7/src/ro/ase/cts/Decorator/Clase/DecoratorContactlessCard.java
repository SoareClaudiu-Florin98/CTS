package ro.ase.cts.Decorator.Clase;

public class DecoratorContactlessCard extends DecoratorAbstract{
    public DecoratorContactlessCard(CardBancar card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCard()).getTitular() + "realizeaza o plata contactless.");

    }
}
