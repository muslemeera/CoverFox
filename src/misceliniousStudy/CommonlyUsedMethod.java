package misceliniousStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethod {

	//reading data from property file
	//taking screenshot
		//scrolling
		//waiting
	public static String readDataFromPropertyFile( String key)throws IOException
	{
		//create object of Properties
		Properties prop = new Properties();
		// creat a object of FileInputStream for file location 
		FileInputStream myfile=new FileInputStream ("C:\\Users\\Admin\\eclipse-workspace\\SeleniumStudy\\MyFile.properties ");
		//load file
		prop.load(myfile);
		// pass the key for the data we want
		String value= prop.getProperty(key);
		return value;
		
	}

	public static void takeScreenshot(WebDriver driver, String fileName) throws
	IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("E:\\My Screenshot pic\\"+fileName+".png");
     FileHandler.copy(src, dest);
	}
  
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
JavascriptExecutor js = (JavascriptExecutor)driver;
	implicitWait(driver, 10);
	js.executeScript("arguments[0].scrollIntoView();",element );
	}
	public static void implicitWait(WebDriver driver, int time)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public static String readDataFromExcel(int row,int cell) throws IOException 
	
	{
	FileInputStream myFile= new FileInputStream("");
	 Sheet mySheet = WorkbookFactory.create(myFile).getSheet("");
	 String value =mySheet.getRow(row).getCell(cell).getStringCellValue();
	 return value;
	}	
	
}
	
	
	
	