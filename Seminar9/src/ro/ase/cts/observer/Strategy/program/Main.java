package ro.ase.cts.observer.Strategy.program;

import ro.ase.cts.observer.Strategy.clase.Client;
import ro.ase.cts.observer.Strategy.clase.PlataCard;
import ro.ase.cts.observer.Strategy.clase.PlataCash;
import ro.ase.cts.observer.Strategy.clase.PlataBonuriMasa;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ionel", new PlataCard()) ;
        client.platesteNota(200);
        client.setPlata(new PlataCash());
        client.platesteNota((float) 100.3);
        client.setPlata(new PlataBonuriMasa());
        client.platesteNota((float)1000.2);
    }
}
