package ro.ase.cts.State2.clase;

public class StareOcupata implements Stare{
    @Override
    public void modificaState(Masa masa) {
        if( !(masa.getStare() instanceof StareOcupata)){
            System.out.println("Masa cu numarul "+masa.getNrMasa() + " a fost ocupata");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa nu poate fi ocupata");
        }
    }
}
