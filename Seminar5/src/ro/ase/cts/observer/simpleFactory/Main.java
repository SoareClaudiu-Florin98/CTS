package ro.ase.cts.observer.simpleFactory;

import ro.ase.cts.observer.simpleFactory.clase.Factory;
import ro.ase.cts.observer.simpleFactory.clase.PersonalMedical;
import ro.ase.cts.observer.simpleFactory.clase.FactorySingletone;
import ro.ase.cts.observer.simpleFactory.clase.TipPersonal;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Factory factory= new Factory() ;
        try {

            PersonalMedical medic1=  factory.create(TipPersonal.MEDIC, "Ionescu",5000) ;
            PersonalMedical asistent1 = factory.create(TipPersonal.MEDIC, "Popescu",5000) ;

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        PersonalMedical medic2=  FactorySingletone.getInstance().create(TipPersonal.MEDIC, "Petrica",
                12345) ;
    }
}
