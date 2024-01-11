package crossBrowserTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTest1 {
	@Parameters("bName")
	  @Test
	  public void f(String browserName) throws InterruptedException  
	  {
			WebDriver driver= new ChromeDriver();
			
			if(browserName.equals("chrome"))
			{
			driver= new ChromeDriver()	;
			}
			else if (browserName.equals("firFox"))
			{
				driver= new FirefoxDriver();	
			}
		   driver.manage().window().maximize();
		  driver.get(" https://en-gb.facebook.com");
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Create new account")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.name("firstname")).sendKeys("Meera");
		 driver.findElement(By.name("lastname")).sendKeys("Sirsath");
		 driver.findElement(By.name("reg_email__")).sendKeys("8624569836");
		 Thread.sleep(5000);
		 driver.close();
	  }
	}


