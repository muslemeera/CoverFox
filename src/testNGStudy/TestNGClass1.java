package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass1 {
  @Test
  public void myMethod()
  {
	  System.out.println(" hi this is printing statement");
	  Reporter.log("Hi this is Reporter,without boolean parameter");
	  Reporter.log("Hi this is Reporter,with boolean parameter",true);
	  
  }
}
