package ro.ase.cts.Teste;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.Grupa;
import ro.ase.cts.Mock.DummyStudent;
import ro.ase.cts.Mock.StudentStub;
import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;

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
    @Category(TesteUrgente.class)
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


    @Test
    @Category({TesteUrgente.class , TesteRight.class})

    public void testGetPromovabilitate(){
        Grupa grupa = new Grupa(1088) ;
        StudentStub studentStub = new StudentStub() ;
        grupa.adaugaStudent(studentStub);
        assertEquals(0,grupa.getPromovabilitate(),0.01);


    }

}