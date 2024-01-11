package testNGAnotationUse;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AfterMethodUse {
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is running",true);
  }
  @Test
  public void TC2() 
  {
	  Reporter.log("TC2 is running",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("before Method is running",true);  
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("after Method is running",true);  
  }
@BeforeClass
public void beforeClass ()
{
	 Reporter.log(" Open brouser before class",true);  	
}
  @AfterClass
public void afterClass()
{
	  Reporter.log(" close brouser after class",true); 
}
}
