package testNGAnotationUse;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2{
	@Test
	public void TC3() 
	{
		  Reporter.log("Running TC3",true);
	}

@Test
public void TC4() 
{
	  Reporter.log("Running TC4",true);
}
@BeforeMethod
public void beforeMethod()
{
	  Reporter.log("before method is running",true);
}

@AfterMethod
public void afterMethod() 
{
	  Reporter.log(" afterMethod is running",true);  
}

@BeforeClass
public void beforeClass() 
{
	  Reporter.log(" before class is running",true);  
}

@AfterClass
public void afterClass()
{
	  Reporter.log(" after class is running",true);    
}

@BeforeTest
public void beforeTest() 
{
	  Reporter.log(" before Test is running",true);    
}

@AfterTest
public void afterTest() 
{
	  Reporter.log(" after Test is running",true);   
}

}



