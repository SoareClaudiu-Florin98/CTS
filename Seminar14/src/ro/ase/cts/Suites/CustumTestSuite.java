package ro.ase.cts.Suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;

@RunWith(Categories.class)
@Categories.IncludeCategory({TesteUrgente.class})
@Categories.ExcludeCategory({TesteRight.class})
@Suite.SuiteClasses(CompleteTestSuite.class) //nerecomandat
public class CustumTestSuite {
}
