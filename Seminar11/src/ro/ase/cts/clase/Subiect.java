package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> listaObservatori ;

    public Subiect() {
        this.listaObservatori = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer) {

        this.listaObservatori.add(observer) ;
    }
    public void stergeAbonat(Observer observer) {
        this.listaObservatori.remove(observer) ;
    }
    public  void trimiteNotificare(String mesaj){
        for(Observer obs: listaObservatori){
            obs.receptionareMesaj(mesaj);
        }
    }

}
