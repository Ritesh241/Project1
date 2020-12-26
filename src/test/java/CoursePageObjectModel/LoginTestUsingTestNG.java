package CoursePageObjectModel;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CoursePageObjectModel.LoginPage;
import CoursePageObjectModel.WelcomePage;

@Test
public class LoginTestUsingTestNG {
	
	public String baseURL= "http://demo.guru99.com/test/newtours/";
	public FirefoxDriver driver;
	
  @BeforeTest
  public void setup() 
  {
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
	  driver= new FirefoxDriver();	
	  driver.get(baseURL);
	  
  } 
  
  @Test
  public void TestLoginFail() throws InterruptedException
  {
	  LoginPage.username(driver).sendKeys("otheruser");
	  LoginPage.password(driver).sendKeys("Test123");
	  LoginPage.submit(driver).click();
	  Thread.sleep(5000);
	    
  }
  
  @Test
  public void TestLoginSuccess() throws InterruptedException
  {
	  	LoginPage.username(driver).clear();
		LoginPage.username(driver).sendKeys("Test123");
		LoginPage.password(driver).clear();
		LoginPage.password(driver).sendKeys("Test123");
		LoginPage.submit(driver).click();
		Thread.sleep(5000);
		
		String message= WelcomePage.message(driver).getText();
		System.out.println(message);
		
		WelcomePage.signout(driver).click();
		Thread.sleep(5000);
	    
  }
  
  	@AfterTest	
  	public void endSession() 
    {
  		driver.close();
  	  
    } 
  
}
