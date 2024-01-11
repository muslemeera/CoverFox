package dataProviderUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBAccountForm
{
  @Test(dataProvider = "FBSmoke",dataProviderClass=FBDataProvider.class)
  public void fbTest(String firstName, String lastname,String mobNum) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(" https://en-gb.facebook.com");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Create new account")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.name("firstname")).sendKeys("Firstname");
	 driver.findElement(By.name("lastname")).sendKeys("Lastname");
	 driver.findElement(By.name("reg_email__")).sendKeys("MobNum");
	 Thread.sleep(5000);
	 driver.close();
  }
}
