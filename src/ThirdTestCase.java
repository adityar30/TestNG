import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ThirdTestCase extends SuiteClass {

	
	@Test
	public void logTest()
	{
		
		System.out.println("Log test");
	}
	
	@Test(dataProvider="getData")
	public void HandlingParametrisation(String company,String CEO)
	{
		System.out.println(company+"--"+CEO);
		
	}
	
	@DataProvider
	public String [][] getData()
	{
		String data[][]= new String [2][2];
			data[0][0]="Google";
			data[0][1]="Sundar Pichai";
			data[1][0]="Pepsi";
			data[1][1]="Indra Nooyi";
			
			return data;
		
	}
}
