package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;

public class Grupa {
    private List<IStudent> studenti;
    private int nrGrupa;

    public Grupa(int nrGrupa){
        if(nrGrupa<1000 || nrGrupa>1100){
            throw new IllegalArgumentException() ;
        }
        else{
            this.nrGrupa=nrGrupa;
            studenti=new ArrayList<>();
        }

    }

    public List<IStudent> getStudenti() {
        return studenti;
    }

    public void importaStudenti(List<IStudent> studenti){
        this.studenti.addAll(studenti);
    }

    public void adaugaStudent(IStudent student){
        if(studenti.size() == 35){
            throw new IllegalArgumentException() ;

        }
        studenti.add(student);
    }

    public IStudent getStudent(int index){
        if(index>=0 && index< studenti.size()){
            return studenti.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public float getPromovabilitate(){
        int nrRestantieri=0;
        for(IStudent student:studenti){
            if(student.areRestante()){
                nrRestantieri++;
            }
        }
        return studenti.size()/nrRestantieri;
    }

    public int getNrGrupa() {
        return this.nrGrupa ;
    }


}
