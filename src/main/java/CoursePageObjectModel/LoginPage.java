package CoursePageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element =null;
	
	public static WebElement username(WebDriver driver)
	{
		element= driver.findElement((By.xpath("//input[@name='userName']")));
		return element;
	}


	public static WebElement password(WebDriver driver)
	{
		element= driver.findElement((By.xpath("//input[@name='password']")));
		return element;
	}
	
	public static WebElement submit(WebDriver driver)
	{
		element= driver.findElement((By.xpath("//input[@name='submit']")));
		return element;
	}

}
