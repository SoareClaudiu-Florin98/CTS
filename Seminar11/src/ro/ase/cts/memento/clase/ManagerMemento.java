package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> listaMemento ;

    public ManagerMemento() {
        this.listaMemento = new ArrayList<>() ;
    }

    public ManagerMemento(List<Memento> listaMemento) {
        this.listaMemento = listaMemento;
    }
    public void addMemento(Memento memento){
        this.listaMemento.add(memento) ;
    }
    public Memento getLastMemento(){
        if(this.listaMemento.size() != 0 ){
           return this.listaMemento.get(this.listaMemento.size()-1) ;
        }
        throw new  IndexOutOfBoundsException() ;
    }
    public Memento getMemento(int index){
        if(index >= 0 && index<this.listaMemento.size() ){
            return listaMemento.get(index) ;
        }
        throw new  IndexOutOfBoundsException() ;

    }
}
