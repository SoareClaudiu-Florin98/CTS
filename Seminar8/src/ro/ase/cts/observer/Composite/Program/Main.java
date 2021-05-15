package ro.ase.cts.observer.Composite.Program;

import ro.ase.cts.observer.Composite.clase.Produs;
import ro.ase.cts.observer.Composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi= new Sectiune("bauturi") ;
        Sectiune desert= new Sectiune("desert") ;
        Produs cola = new Produs("Cola") ;
            Produs tiramisu= new Produs("tiramisu") ;
            Produs frappe= new Produs("Frappe") ;
            Sectiune meniu= new Sectiune("Meniu") ;
            meniu.adaugareNod(bauturi);
            meniu.adaugareNod(desert);

            bauturi.adaugareNod(cola);
            bauturi.adaugareNod(frappe);
            desert.adaugareNod(tiramisu);

            meniu.printareElement();
            System.out.println("-------------------------");
            bauturi.stergeNod(frappe);
            desert.adaugareNod(frappe);
            meniu.printareElement();

    }
}
