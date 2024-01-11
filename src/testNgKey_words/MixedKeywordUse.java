package testNgKey_words;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MixedKeywordUse {
	@Test(invocationCount=3)
	  public void a() 
	  {
		  Reporter.log(" TC a is running",true);
	  }
	  @Test(dependsOnMethods= {"d"})
	  public void b() 
	  {
		  Reporter.log(" TC b is running",true);
	  }
	  @Test(priority=-8)
	  public void c() 
	  {
		  Reporter.log(" TC c is running",true);
	  }
	  @Test
	  public void d() 
	  {
		  Reporter.log(" TC d is running",true);
	  }
}
