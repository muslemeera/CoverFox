package testNgKey_words;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseKeywordPriority {
  @Test(priority=-5)
  public void a() 
  {
	  Reporter.log(" TC a is running",true);
  }
  @Test(priority=-8)
  public void b() 
  {
	  Reporter.log(" TC b is running",true);
  }
  @Test(priority=2)
  public void c() 
  {
	  Reporter.log(" TC c is running",true);
  }
  @Test(priority=1)
  public void d() 
  {
	  Reporter.log(" TC d is running",true);
  }
}

