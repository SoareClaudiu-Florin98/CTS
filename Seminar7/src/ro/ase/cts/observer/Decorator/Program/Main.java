package ro.ase.cts.observer.Decorator.Program;

import ro.ase.cts.observer.Decorator.Clase.Card;
import ro.ase.cts.observer.Decorator.Clase.DecoratorContactlessCard;
import ro.ase.cts.observer.Decorator.Clase.DecoratorContactlessTelefon;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Popescu Alina") ;
        card.platestePOS();
        card.platesteOnline();
        System.out.println("========================");
        DecoratorContactlessCard decoratorContactless = new DecoratorContactlessCard(card) ;
        decoratorContactless.platesteContactless();
        decoratorContactless.platesteOnline();
        decoratorContactless.platestePOS();
        System.out.println("========================");
        DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card) ;
        decoratorContactlessTelefon.platesteContactless();
        decoratorContactlessTelefon.platestePOS();
        decoratorContactlessTelefon.platesteOnline();
    }
}
