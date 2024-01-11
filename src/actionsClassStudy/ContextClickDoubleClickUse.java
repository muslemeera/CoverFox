package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDoubleClickUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// example for right click(contextclick)
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me'] "));
		Actions act = new Actions(driver);
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		act.contextClick(rightClickButton).perform();
		//example for double click
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert'] "));
		Actions act1 = new Actions(driver);
		act1.doubleClick(DoubleClickButton).perform();
		
		
		
		
	}

	
	}


