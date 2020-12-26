package CourseTestngXml;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
 
	  @Test(dataProvider= "getData")
	  public void YahooLogin(String Username, String Password) 
	  {
		  System.out.println(Username);
		  System.out.println(Password);
		  
	  }
	
	// Object [3][2]- 3 set of data combination, 2 values passed each-Username, password  
	  
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		
		data[0][0]= "user1";
		data[0][1]= "pass1";
		
		data[1][0]= "user2";
		data[1][1]= "pass2";
		
		data[2][0]= "user3";
		data[2][1]= "pass3";
		
		return data;
	}
	  
}
