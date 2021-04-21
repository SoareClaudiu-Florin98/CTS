package ro.ase.cts.State2.program;

import ro.ase.cts.State2.clase.Masa;
import ro.ase.cts.State2.clase.StareLibera;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1) ;
        masa1.elibereazaMasa();
        masa1.ocupaMasa();
        masa1.rezervaMasa();
        masa1.elibereazaMasa();
        masa1.rezervaMasa();
    }
}
