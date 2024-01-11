package webDriverMethodesUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByTextMethodUse {

	public static void main(String[] args) throws InterruptedException {
		
  WebDriver driver =new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.redbus.in/");
  Thread.sleep(3000);
  driver.findElement(By.xpath("//input[@id='src']")).sendKeys("aurangabad"); 
driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("mumbai");
 driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
  Thread.sleep(3000);
}
}