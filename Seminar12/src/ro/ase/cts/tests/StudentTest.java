package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

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
}