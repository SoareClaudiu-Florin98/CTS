package ro.ase.cts.Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.Teste.GrupaTest;
import ro.ase.cts.Teste.GrupaTestWithFake;
import ro.ase.cts.Teste.GrupaTestWithMock;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFake.class, GrupaTestWithMock.class, GrupaTestWithFake.class})
public class CompleteTestSuite {
}
