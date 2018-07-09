import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteClass {

	
	@BeforeSuite
	public void openDb()
	{
		System.out.println("Open DB Connection");
	}
	
	@AfterSuite
	public void closeDb()
	{
		System.out.println("Close Db conection");
	}
}
