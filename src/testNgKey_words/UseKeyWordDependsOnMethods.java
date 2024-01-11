package testNgKey_words;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseKeyWordDependsOnMethods {
  @Test
  public void payment() 
  {
	  Reporter.log(" Payment done", true);
  }
  @Test(timeOut=200)
  public void couponCode() throws InterruptedException 
  {
	  Thread.sleep(200);
	  Reporter.log(" 40% discount is done", true);
  }
  @Test(dependsOnMethods= {"couponCode"})
  public void discount ()
  {
	  
	  Reporter.log(" discount is used", true);
  }
}

