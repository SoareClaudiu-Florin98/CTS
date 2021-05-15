package ro.ase.cts.observer.mainSingletone;

import ro.ase.cts.observer.claseSingletone.ParlamentLazy;
import ro.ase.cts.observer.claseSingletone.Scara;
import ro.ase.cts.observer.claseSingletone.Parlament;

public class Main {
    public static void main(String[] args) {
        Parlament parlament1 = Parlament.getInstance() ;
        Parlament parlament2 = Parlament.getInstance() ;
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("=======================");
        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(300);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        System.out.println("=======================");
        ParlamentLazy parlamentLazy1= ParlamentLazy.getInstance("Serbia",400,8,"Sediul Serbiei") ;
        ParlamentLazy parlamentLazy2= ParlamentLazy.getInstance("UK",400,8,"Sediul Serbiei") ;
        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());
        System.out.println("=======================");

        Scara scara = Scara.getInstance() ;
        Scara scara2 = Scara.getInstance() ;
        System.out.println(scara.toString());
        System.out.println(scara2.toString());
        System.out.println("=======================");
        scara.setCmLungime(200);
        scara2.setCuloare("Rosu");
        System.out.println(scara.toString());
        System.out.println(scara2.toString());




    }
}
