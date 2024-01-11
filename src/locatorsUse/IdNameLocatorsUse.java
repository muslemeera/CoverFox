package locatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameLocatorsUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// driver.get("https://humsafarbus.in/index.aspx");
		Thread.sleep(3000);
		// use type of locators is ID
		driver.findElement(By.id("email")).sendKeys("meera@1234");
		// Use of web element method clear
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("meera@1234");
		Thread.sleep(3000);
		// use type of locators is name
		driver.findElement(By.name("pass")).sendKeys("MeeraSirsath5648");
		driver.findElement(By.name("login")).click();
		
	}

}