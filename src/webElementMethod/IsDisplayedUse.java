package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		boolean result = driver.findElement(By.id("hide-textbox")).isDisplayed();
		{
			System.out.println("Displayed status is "+result);
		}
		boolean result1 = driver.findElement(By.name("show-hide")).isDisplayed();
		System.out.println("Displayed status is "+result1);
		Thread.sleep(2000);
		driver.findElement(By.name("show-hide")).sendKeys("Good Evening");
	}
		

}
