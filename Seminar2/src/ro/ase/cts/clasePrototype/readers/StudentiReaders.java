package ro.ase.cts.clasePrototype.readers;

import ro.ase.cts.clasePrototype.Aplicant;
import ro.ase.cts.clasePrototype.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReaders extends Readable {

    public StudentiReaders(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student  = new Student() ;
            super.readAplicant(input,student);

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setFacultate(facultate);
            student.setAn_studii(an_studii) ;

            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
