package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragaAndDropUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// example for DragaAndDropUse
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);

		//act.moveToElement(source).clickAndHold().moveToElement(target).release().build
		//().perform();

		//act.clickAndHold(source).release(target).build().perform();
		act.dragAndDrop(source, target).perform();
	}

}
