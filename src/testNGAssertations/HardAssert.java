package testNGAssertations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void f() 
  {
	  
	  
	  String a="bye";
	  String b= "hi";
	  Assert.assertEquals(a, b,"a and b are not equal,TCis failed");
	  Assert.assertNotNull(a,"a is null,TC is failed");
  }
  @Test
  public void m()
  {
  String a=null;

  Assert.assertNull(a);
  }
  }
  
  
  





