package ro.ase.cts.simpleFactory.clase;

public class FactorySingletone {

    private static FactorySingletone factorySingletone = null ;
    public static  FactorySingletone getInstance(){
        if(FactorySingletone.factorySingletone == null){
            FactorySingletone.factorySingletone = new FactorySingletone() ;

        }
        return FactorySingletone.factorySingletone ;
    }
    private FactorySingletone(){}

    public static PersonalMedical create(TipPersonal tip, String nume, float salariu) throws IllegalAccessException {
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
}}
