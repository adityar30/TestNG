import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase extends SuiteClass {

	@Test(dependsOnMethods="MutipleRun")
	public void dbTest()

	{
		System.out.println("DB test");
	}
	
	@Test (invocationCount=3)
	public void MutipleRun()

	{
		Assert.assertTrue(false);
		System.out.println("A");
	}
	
	@Test (timeOut=1000)
	public void Timeoutexample()

	{
		System.out.println("B");
	}
}
