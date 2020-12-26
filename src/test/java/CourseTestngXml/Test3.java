package CourseTestngXml;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
  
	  @Test(priority=0)
	  public void GmailLogin() 
	  {
		  System.out.println("GmailLogin");
		  //Assert.assertTrue(false);
	  }

	  @Test(priority=1, dependsOnMethods= {"GmailLogin"})
	  public void GmailCheckMail() 
	  {
		  System.out.println("GmailCheckMail");
		  
	  }
  
	  @Test(priority=2, dependsOnMethods= {"GmailLogin", "GmailCheckMail"})
	  public void GmailLogout() 
	  {
		  System.out.println("GmailLogout");
	  }
	  
	  @Parameters({"URL", "Username"})
	  @Test(priority=3)
	  public void YahooLogin(String urlname, String key) 
	  {
		  System.out.println("YahooLogin");
		  System.out.println(urlname);
		  System.out.println(key);
	  }

	  @Test(priority=4, dependsOnMethods= {"YahooLogin"})
	  public void YahooCheckMail() 
	  {
		  //System.out.println("YahooCheckMail");
		  Assert.assertTrue(false);
	  }
  
	  @Test(priority=5, dependsOnMethods= {"YahooLogin", "YahooCheckMail"})
	  public void YahooLogout() 
	  {
		  System.out.println("YahooLogout");
	  }
	  
}

//assume that there are over 100 such methods.
//use regex- <exclude name="Gmail.*"/>
// OR <include name="Gmail.*"/>
