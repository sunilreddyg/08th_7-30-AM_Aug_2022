package framework.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses
	({ BeforeClass_And_AfterClass.class,
		BeforeMethod_And_AfterMethod.class, 
		Ignore_method.class,
		Junit_Assertions.class,
		MyJunitTest1.class, 
		MyJunitTest2.class,
		WebDriver_TestCase1.class
	})
public class AllTests 
{

}
