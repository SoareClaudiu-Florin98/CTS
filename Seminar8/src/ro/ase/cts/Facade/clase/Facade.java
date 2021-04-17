package ro.ase.cts.Facade.clase;

public class Facade {
    public static boolean esteMasaPregatita( Masa masa){

        if(OperatorMese.esteLibera(masa.getNrMasa())) {
            Picolo picolo1 = new Picolo("Gigel") ;
            if( picolo1.esteDebarasataMasa(masa.getNrMasa())){
                if(picolo1.esteAranjata(masa.getNrMasa())){
                    return true ;
                }
            }

        }

        return false ;
    }
}