package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		// 1 find out the locator of web element where we need to perform action.
		//and store in some reference variable
	 WebElement loginButton = driver.findElement(By.name("login"));
	  // 2. Create an object of an Actions class which will accept driver object as a parameter
	 Actions act =new Actions( driver);
	// 3.using one of the Action class methods perform an action
	// act.moveToElement(loginButton).click().build().perform();
	act.click(loginButton).perform();
	 
	 
	 
	 
	 
	 
	 
	}
}
