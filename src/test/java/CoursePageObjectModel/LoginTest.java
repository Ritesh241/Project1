package CoursePageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CoursePageObjectModel.LoginPage;
import CoursePageObjectModel.WelcomePage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();	
		driver.get("http://demo.guru99.com/test/newtours/");
		
		//Login fails
		LoginPage.username(driver).sendKeys("otheruser");
		LoginPage.password(driver).sendKeys("Test123");
		LoginPage.submit(driver).click();
		Thread.sleep(5000);
		
		//Login success
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
		
		driver.close();
		
		
		
	}

}
