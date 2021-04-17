package ro.ase.cts.Facade.simpleFactory.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
