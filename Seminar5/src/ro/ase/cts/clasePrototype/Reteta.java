package ro.ase.cts.clasePrototype;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements  AbstractPrototype{
    private List<String> denumireSolutii ;
    private List<Integer> cantitati ;

    public List<String> getDenumireSolutii() {
        return denumireSolutii;
    }

    public void setDenumireSolutii(List<String> denumireSolutii) {
        this.denumireSolutii = denumireSolutii;
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }

    public void setCantitati(List<Integer> cantitati) {
        this.cantitati = cantitati;
    }

    public Reteta(List<String> denumireSolutii, List<Integer> cantitati) {
        this.denumireSolutii = denumireSolutii;
        //realizam validari
        this.cantitati = cantitati;
    }

    private Reteta() {
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta copie = new Reteta() ;
        copie.cantitati = new ArrayList<>() ;
        copie.cantitati.addAll(this.cantitati);
        copie.denumireSolutii = new ArrayList<>() ;
        copie.denumireSolutii.addAll(this.denumireSolutii) ;
        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutii=").append(denumireSolutii);
        sb.append(", cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }
}
