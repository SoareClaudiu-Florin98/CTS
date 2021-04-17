package ro.ase.cts.Facade.clasePrototype;

public class Elev extends Aplicant{
    private int clasa;
    private String tutore;
    private static float sumaFinantata = 30 ;

    public int getClasa() {
        return clasa;
    }
    public void setClasa(int clasa) {
        this.clasa = clasa;
    }
    public String getTutore() {
        return tutore;
    }
    public void setTutore(String tutore) {
        this.tutore = tutore;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder() ;
        result.append(super.toString());
        result.append(" Clasa: ").append(clasa).append(" Tutore: ").append(tutore) ;

        return result.toString();
    }

    public Elev() {
        super();
    }

    @Override
    public float getFinantare() {
        return sumaFinantata;
    }

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Elev.sumaFinantata = sumaFinantata;
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public int finantare() {
        int s=30;
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
        return s;
    }

}