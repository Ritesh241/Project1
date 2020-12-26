package CoursePageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {

	private static WebElement element =null;
	
	public static WebElement message(WebDriver driver)
	{
		element= driver.findElement((By.xpath("//h3[contains(text(),'Login Successfully')]")));
		return element;
	}

	public static WebElement signout(WebDriver driver)
	{
		element= driver.findElement((By.xpath("//a[contains(text(),'SIGN-OFF')]")));
		return element;
	}


}
