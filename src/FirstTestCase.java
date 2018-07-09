import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestCase extends SuiteClass {

	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("CLose Browser");
	}
	
	
	@BeforeMethod
	public void openGmail()
	{
		System.out.println("Gmail Open");
	}
	
	@AfterMethod
	public void closeGmail(){
		
		System.out.println("Gmail Close");
	}
	@Test(enabled=false)
	public void loginTest() {

		System.out.println("Login");
	}

	@Test(priority=2)
	public void logoutTest() {
		System.out.println("logout");

	}

	@Test(priority=1)
	public void verifiedTest() {
		System.out.println("Verified all");
	}
	
	
}
