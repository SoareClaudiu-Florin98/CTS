package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {
    Student student ;

    @Test
    public void calculeazaMedie() {
    }
    @Test
    public void testConstructorWorksCorectlyForName(){
        String nume = "Gigel ";
        Student student = new Student(nume) ;
        assertEquals(nume, student.getNume());
    }
    @Test
    public void testSetNume(){
        String nume = "Popescu";
        Student student = new Student() ;
        student.setNume(nume);
        assertEquals(nume, student.getNume());
    }
    @Test
    public void testConstructorWorksCorectly(){
        Student student = new Student() ;


        assertNotNull("Lista de note nu a fost initializata",student.getNote());
        assertNotNull("Numele nu a fost initializat",student.getNume());
    }

    @Test
    public void testAdaugaNota(){
        Student student = new Student() ;
        int nota = 10 ;
        student.adaugaNota(nota);
    assertEquals(nota, student.getNota(0));
    }
    @Test
    public void testGetNota(){
        Student student = new Student() ;
        student.adaugaNota(10);
        student.adaugaNota(5);
        student.adaugaNota(9);
        assertEquals(9, student.getNota(2));
    }
    @Test
    public void testAdaugaOSinguraNota(){
        Student student = new Student() ;
        int nota = 10 ;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }
    @Test
    public void testAdaugaONotaIncorecta(){
        Student student = new Student() ;
        try {
            student.adaugaNota(-1);
            fail("nu trebuia sa ajunga aici. Metoda nu arunca exceptii") ;
        }catch(IllegalArgumentException ex){
        }
        catch(Exception e){
            fail("nu arunca o excerptie de tipul illegal argument") ;

        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaONotaIncorectaJunit4(){
        Student student = new Student() ;
        student.adaugaNota(-1);

        }

    @Test
    public void testStudentulAreRestante(){
        Student student = new Student() ;
        student.adaugaNota(3);
        boolean rezultat  = student.areRestante() ;
        assertTrue(rezultat);

    }
    @Test
    public void testStudentulNuAreRestante(){
        Student student = new Student() ;
        student.adaugaNota(6);
        boolean rezultat  = student.areRestante() ;
        assertFalse(rezultat);
    }
    @Test
    public void testCalculeazaMedieCorect(){
        Student student = new Student() ;
        student.adaugaNota(6);
        student.adaugaNota(5);
        float rezultat  = student.calculeazaMedie() ;
        assertEquals(5.5, rezultat, 0.1);
    }

}
