package ro.ase.cts.clasePrototype.readers;

import ro.ase.cts.clasePrototype.Angajat;
import ro.ase.cts.clasePrototype.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends Readable{

    public AngajatiReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat angajat  = new Angajat() ;
            super.readAplicant(input2,angajat);

            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;

    }
}
