package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{

    private String ocupatie;
    private int salariu;
    private static float sumaFinantata =10 ;

    public String getOcupatie() {
        return ocupatie;
    }
    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }
    public int getSalariu() {
        return salariu;
    }
    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
        super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }
    public Angajat() {
        super();

    }

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Angajat.sumaFinantata = sumaFinantata;
    }

    @Override
    public float getFinantare() {
        return sumaFinantata;
    }


    @Override
    public String toString() {
        return "Angajat: Nume=" + nume + ", Prenume=" + prenume
                + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte + ", DenumireProiect="
                + Arrays.toString(denumiriProiecte) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
    }



}
