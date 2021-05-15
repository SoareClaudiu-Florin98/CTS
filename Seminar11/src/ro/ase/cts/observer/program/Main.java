package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Manager1") ;
        ClientAbonat clientAbonat = new ClientAbonat("Popescu") ;
        ClientAbonat clientAbonat2 = new ClientAbonat("Georgescu") ;
        ClientAbonat clientAbonat3 = new ClientAbonat("Bla") ;


        managerSala.adaugaAbonat(clientAbonat);
        managerSala.adaugaAbonat(clientAbonat2);
        managerSala.adaugaAbonat(clientAbonat3);
        managerSala.stergeAbonat(clientAbonat);
        managerSala.anuntaMeci("volei");
        managerSala.anuntaMeci("fotbal");

    }
}
