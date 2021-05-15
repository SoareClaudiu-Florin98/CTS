package ro.ase.cts.observer.simpleFactory.clase;

public class Factory {
    public PersonalMedical create(TipPersonal tip, String nume, float salariu) throws IllegalAccessException {
        switch (tip){
            case MEDIC:
                return new Medic(nume,salariu) ;
            case ASISTENT:
                return new Asistent(nume,salariu) ;
            case BRANCARDIER:
                return new Brancardier(nume,salariu) ;

            default:
                throw new IllegalAccessException("Tipul nu este corect");
        }





    }

}
