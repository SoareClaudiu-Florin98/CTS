package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.clase.*;

public class Main {

    public static void afiseazaInformatiiJucator(FabricaJucatori fabrica, String nume, int nrTricouri) {
        Jucator jucator = fabrica.creazaJucator(nume,nrTricouri);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInformatiiJucator(new FabricaAtacant(),"Popescu",15);
        afiseazaInformatiiJucator(new FabricaPortar(),"Andrei",21);
        afiseazaInformatiiJucator(new FabricaMijlocas(),"Andrei",21);



    }
}
