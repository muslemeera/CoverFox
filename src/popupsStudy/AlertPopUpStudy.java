package popupsStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    Thread.sleep(1000);
    driver.findElement(By.name("cusid")).sendKeys("5426585455");
    Thread.sleep(1000);
    driver.findElement(By.name("submit")).click();
    //Handling alert  popup
    Thread.sleep(2000);
   Alert alt = driver.switchTo().alert();
   Thread.sleep(2000);
   alt.dismiss();
   // if i want to click button on alert
   //Thread.sleep(1000);
  // 
   //Thread.sleep(1000);
  
		   
	}

}
