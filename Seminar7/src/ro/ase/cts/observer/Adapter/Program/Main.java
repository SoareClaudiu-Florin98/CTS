package ro.ase.cts.observer.Adapter.Program;

import ro.ase.cts.observer.Adapter.Clase.AdapterLeasingClase;
import ro.ase.cts.observer.Adapter.Clase.AdapterLeasingObiecte;
import ro.ase.cts.observer.Adapter.Clase.Creditable;
import ro.ase.cts.observer.Adapter.Clase.Leasing;

public class Main {

    public static void printeazaInformatiiCredit(Creditable credit){
        credit.Crediteaza();

    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Bogdan", 10000) ;
        AdapterLeasingObiecte adapterLeasing= new AdapterLeasingObiecte(leasing) ;
        adapterLeasing.Crediteaza();
        System.out.println("--------------------");
        printeazaInformatiiCredit(adapterLeasing);

        AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("Gigel", 123456) ;
        printeazaInformatiiCredit(adapterLeasingClase);

    }
}
