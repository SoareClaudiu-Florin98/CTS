package ro.ase.cts.simpleFactory.clase;

public class Asistent extends PersonalMedical{
    private int durataLucru ;

    public Asistent(String nume, float salariu, int durataLucru) {
        super(nume, salariu);
        this.durataLucru = durataLucru;
    }

    public int getDurataLucru() {
        return durataLucru;
    }

    public void setDurataLucru(int durataLucru) {
        this.durataLucru = durataLucru;
    }

    public Asistent(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
