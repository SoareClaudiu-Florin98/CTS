package ro.ase.cts.Teste;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.cts.Grupa;
import ro.ase.cts.Mock.DummyStudent;

import static org.junit.Assert.*;

public class GrupaTestWithMock {
    private static Grupa grupa ;
    @BeforeClass
    public static void creareGrupa(){
        grupa = new Grupa(1086) ;
        for(int i = 0 ;i<35 ; i++){
            DummyStudent studentDummy = new DummyStudent() ;
            grupa.adaugaStudent(studentDummy);
        }
    }
    @Test
    public void adaugaStudentBoundarySuperior(){
        assertEquals(35,grupa.getStudenti().size());
    }


    @Test
    public void adaugaStudent(){
        Grupa grupa = new Grupa(1086) ;
        DummyStudent dummyStudent = new DummyStudent() ;
        grupa.adaugaStudent(dummyStudent);
        assertEquals(1,grupa.getStudenti().size());
    }
    @Test(expected = IllegalArgumentException.class)
    public void adaugaStudentExceptie(){
            DummyStudent studentDummy = new DummyStudent() ;
            grupa.adaugaStudent(studentDummy);
    }

}