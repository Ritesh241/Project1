package CourseTestngXml;

import org.testng.annotations.Test;

public class Test1b {
  
	@Test(priority=0, timeOut=4000)
	  public void third() 
	  {
		  System.out.println("third");
	  }

	  @Test(priority=1,groups= {"SmokeTest"}) 
	  public void fourth() 
	  {
		  System.out.println("fourth");
	  }
	
		
}
