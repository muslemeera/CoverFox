package popupsStudy;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HiddendivisionEg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.findElement(By.xpath("//a[text()='View Pop-up']")).click();
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("meera");
 driver.findElement(By.cssSelector("button.alert")).click();
Alert alt = driver.switchTo().alert();
Thread.sleep(1000);
 alt.accept();
{ 
	
}
}
//notconform output not showing exception
}
