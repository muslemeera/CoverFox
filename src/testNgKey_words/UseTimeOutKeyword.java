package testNgKey_words;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseTimeOutKeyword {
  @Test(timeOut=7000)
  public void Payment() throws InterruptedException 
  {
	  Thread.sleep(6000);
	  Reporter.log(" Payment done successfully", true);
  }
}
