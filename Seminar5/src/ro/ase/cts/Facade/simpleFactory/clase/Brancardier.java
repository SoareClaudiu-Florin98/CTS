package ro.ase.cts.Facade.simpleFactory.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}