package CourseTestngXml;

import org.testng.annotations.Test;

public class Test1a {
  
	
  @Test(groups= {"SmokeTest"}) 
  public void first() 
  {
	  System.out.println("first");
  }

  @Test(enabled= false) 
  public void second() 
  {
	  System.out.println("second");
  }
  

}
