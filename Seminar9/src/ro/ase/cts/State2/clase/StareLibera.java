package ro.ase.cts.State2.clase;

import ro.ase.cts.State.clase.Libera;

public class StareLibera implements Stare{
    @Override
    public void modificaState(Masa masa) {
        if( !(masa.getStare() instanceof StareLibera)){
            System.out.println("Masa cu numarul "+masa.getNrMasa() + " a fost eliberata");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa nu poate fi eliberata");
        }


    }
}
