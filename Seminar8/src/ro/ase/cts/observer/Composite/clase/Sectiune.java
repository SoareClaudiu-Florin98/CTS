package ro.ase.cts.observer.Composite.clase;

import java.util.ArrayList;

public class Sectiune implements ComponentaAbstracta{
    private String nume ;
    private ArrayList<ComponentaAbstracta> listaComponente = new ArrayList<>() ;

    public Sectiune(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ArrayList<ComponentaAbstracta> getListaComponente() {
        return listaComponente;
    }

    public void setListaComponente(ArrayList<ComponentaAbstracta> listaComponente) {
        this.listaComponente = listaComponente;
    }

    @Override
    public void printareElement() {
        System.out.println("Sectiune "+this.nume);
        for(ComponentaAbstracta componentaAbstracta:listaComponente){
            componentaAbstracta.printareElement();
        }
    }

    @Override
    public void adaugareNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta != null){
            listaComponente.add(componentaAbstracta) ;
        }


    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        listaComponente.remove(componentaAbstracta) ;
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        if(pozitie>= 0 && pozitie<listaComponente.size()){
          return  listaComponente.get(pozitie) ;
        }
        throw new IndexOutOfBoundsException() ;
    }
}
