package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ squareUnit.class, sumUnit.class })
public class AllTests {

}
