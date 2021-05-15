package ro.ase.cts.observer.Flyweight.Program;

import ro.ase.cts.observer.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.observer.Flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare  rezervare1= new Rezervare(1,1) ;
        Rezervare  rezervare2= new Rezervare(2,1) ;
        Rezervare  rezervare3= new Rezervare(3,1) ;
        FlyweightFactory flyweightFactory= new FlyweightFactory() ;
        flyweightFactory.getClienti("123456").printeazaRezervare(rezervare1);
        flyweightFactory.getClienti("123457").printeazaRezervare(rezervare2);
        flyweightFactory.getClienti("123456").printeazaRezervare(rezervare3);



    }
}
