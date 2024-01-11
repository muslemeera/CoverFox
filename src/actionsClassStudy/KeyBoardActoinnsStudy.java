package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActoinnsStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		// WebElement day = driver.findElement(By.id("day"));
		Actions act= new Actions(driver);
		//act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
		//Thread.sleep(500);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(500);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(500);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(500);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(500);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//act.sendKeys(Keys.ENTER).perform();
		//act.click(day).perform();
		//for( int i=0;i<=20;i++)
		//{
			//act.sendKeys(Keys.ARROW_UP).perform();
			//Thread.sleep(500);
		//}
		//act.sendKeys(Keys.ENTER).perform();
		
		WebElement firstField= driver.findElement(By.name("firstname"));
		act.sendKeys(firstField, "MEERA").perform();
		//act.keyDown(firstnameField,Keys.SHIFT).sendKeys("velocity").build().perform();

				// act.keyDown(firstnameField,
			//Keys.SHIFT).sendKeys("v").keyUp(Keys.SHIFT).sendKeys("elocity").build().perform();
		
	//	note- incomplete program
		
		
		
		

	}

}
