package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;
    private static float sumaFinantata =20;


    public String getFacultate() {
        return facultate;
    }
    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
    public int getAn_studii() {
        return an_studii;
    }
    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }


    public Student() {
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
        Student.sumaFinantata = sumaFinantata;
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
        super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
        this.facultate = facultate;
        this.an_studii = an_studii;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder() ;
        result.append(super.toString()).append(" Faculate: ").append(facultate).append(" An studii: ").append(an_studii) ;
        return result.toString() ;
    }


    public int finantare() {
        int s=20;
        System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
        return s;
    }

}