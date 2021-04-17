package ro.ase.cts.Program;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Masa;

public class Main {
    public static void main(String[] args) {

        if(Facade.esteMasaPregatita( new Masa(30,4)) ){
            System.out.println("Poftiti la masa domnule client! ");
        }
        else{
            System.out.println("Va rog mai asteptati putin!");

        }

    }
}
