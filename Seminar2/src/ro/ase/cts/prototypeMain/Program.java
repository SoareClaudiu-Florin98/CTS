package ro.ase.cts.prototypeMain;
import ro.ase.cts.clasePrototype.Proiect;
import ro.ase.cts.clasePrototype.readers.EleviReader;
import ro.ase.cts.clasePrototype.readers.Readable;
import ro.ase.cts.clasePrototype.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
    public static List<Aplicant> citesteAplicanti(Readable reader) throws FileNotFoundException {
        return reader.readAplicanti() ;
    }


    public static void main(String[] args) {
        List<Aplicant> listaAplicanti ;
        try {
            listaAplicanti = citesteAplicanti(new EleviReader("Seminar2/elevi.txt"));
            for(Aplicant aplicant:listaAplicanti){
                System.out.println(aplicant.toString());
                System.out.println(aplicant.getFinantare());
                aplicant.displayStateInProject(new Proiect(80));
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
