
package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExample2 {
  @Test
  public void fbLaunch() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Reporter.log(" FB Launching",true);
  }
  @Test
  public void instaLaunch() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.instagram.com/accounts/login/");
	  Reporter.log(" Insta Launching",true);
  }
  @Test
  public void twitterLaunch() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get(" http://www.discardless.eu/twitter.com/login62b1.html?lang=en-gb");
	  Reporter.log(" twitter Launching",true);
  }
  
  
}
