package testNGStudy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstProgramOnTestNG {
  @Test // this for method/ testCase
// in testNGclass there is no need to main method
  public void KiteLogin() 
  {
	  WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
}


  
  
  
  
  
  {
  }
}
