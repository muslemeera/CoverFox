package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUseingActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement sunday = driver.findElement(By.id("sunday"));
		WebElement monday = driver.findElement(By.id("monday"));
		WebElement tuesday = driver.findElement(By.id("tuesday"));
    Actions act=new Actions(driver);
    act.scrollToElement(sunday).perform();
    Thread.sleep(1000);
    monday.click();
    Thread.sleep(1000);
    tuesday.click();
    Thread.sleep(1000);
    //note-program output show exception chake later.

     
     
	}
}