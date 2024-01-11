package testNGAnotationUse;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethodUse  {
  @Test
  public void myMethod1() 
  {
	  Reporter.log(" TC is my Method1 its running",true);
  }
  @Test
  public void myMethod2() 
  {
	  Reporter.log(" TC is my Method2 its running",true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log(" login is done",true);  
	  
  }
@AfterMethod
  public void logout()
{
	 Reporter.log(" logout is  done",true); 
  }
}

