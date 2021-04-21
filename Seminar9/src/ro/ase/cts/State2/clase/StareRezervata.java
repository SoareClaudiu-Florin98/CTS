package ro.ase.cts.State2.clase;

public class StareRezervata implements Stare{
    @Override
    public void modificaState(Masa masa) {
        if( masa.getStare() instanceof StareLibera){
            System.out.println("Masa cu numarul "+masa.getNrMasa() + " a fost rezervata");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa nu poate fi rezervata");
        }
    }
}
