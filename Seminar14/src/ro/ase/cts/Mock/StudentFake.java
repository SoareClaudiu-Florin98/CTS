package ro.ase.cts.Mock;

import ro.ase.cts.IStudent;

import java.util.List;

public class StudentFake implements IStudent {
    String valoareGetNume ;
    List<Integer> valoareGetNote ;
    float valoareCalculeazaMedie ;
    int valoareGetNota ;
    boolean valoareAreRestanta ;

    public void setValoareGetNume(String valoareGetNume) {
        this.valoareGetNume = valoareGetNume;
    }

    public void setValoareGetNote(List<Integer> valoareGetNote) {
        this.valoareGetNote = valoareGetNote;
    }

    public void setValoareCalculeazaMedie(float valoareCalculeazaMedie) {
        this.valoareCalculeazaMedie = valoareCalculeazaMedie;
    }

    public void setValoareGetNota(int valoareGetNota) {
        this.valoareGetNota = valoareGetNota;
    }

    public void setValoareAreRestanta(boolean valoareAreRestanta) {
        this.valoareAreRestanta = valoareAreRestanta;
    }

    @Override
    public String getNume() {
        return this.valoareGetNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return this.valoareGetNote;
    }

    @Override
    public void adaugaNota(int nota) {


    }

    @Override
    public float calculeazaMedie() {
        return valoareCalculeazaMedie;
    }

    @Override
    public int getNota(int index) {
        return valoareGetNota;
    }

    @Override
    public boolean areRestante() {
        return valoareAreRestanta;
    }
}
