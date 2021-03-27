package ro.ase.cts.simpleFactory;

import ro.ase.cts.simpleFactory.clase.*;

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
