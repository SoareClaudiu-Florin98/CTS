package ro.ase.cts.Chain.program;

import ro.ase.cts.Chain.clase.Cont;
import ro.ase.cts.Chain.clase.ContCredit;
import ro.ase.cts.Chain.clase.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCredit(150) ;
        Cont contCredit = new ContCredit(200) ;
        Cont contEconomii = new ContEconomii(150) ;
        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);
        contCurent.realizeazaPlate(100);
        contCredit.realizeazaPlate(150);
        contCurent.realizeazaPlate(100);
        contCurent.realizeazaPlate(100);
        contCurent.realizeazaPlate(100);


    }
}
