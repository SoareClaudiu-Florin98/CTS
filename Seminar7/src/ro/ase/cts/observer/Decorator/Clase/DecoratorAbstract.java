package ro.ase.cts.observer.Decorator.Clase;

public abstract class DecoratorAbstract implements CardBancar{
    private CardBancar card ;

    public DecoratorAbstract(CardBancar card) {
        this.card = card;
    }
    public abstract void platesteContactless() ;

    @Override
    public void platestePOS() {
        card.platestePOS();
    }

    public CardBancar getCard() {
        return card;
    }

    public void setCard(CardBancar card) {
        this.card = card;
    }

    @Override
    public void platesteOnline() {
        card.platesteOnline();
    }
}
