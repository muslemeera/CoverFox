package weekendMock;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeOnDropDownStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
      Thread.sleep(1000);
     List<WebElement> Multiselected = driver.findElements(By.xpath("//select[@id='second']"));
Select s=new Select((WebElement) Multiselected);
System.out.println("Result "+s.isMultiple());
s.selectByIndex(0);
Thread.sleep(1000);
s.selectByVisibleText("Donut");
Thread.sleep(1000);
s.selectByIndex(2);
Thread.sleep(1000);
s.selectByVisibleText("Bonda");
Thread.sleep(1000);
System.out.println("===========================================");
 List<WebElement> all = s.getAllSelectedOptions();//Get AllSelected Options method is used to show selected elements which are present in list
 System.out.println("====Traversing through Iterator========");
 Iterator<WebElement> ite = all.iterator();
 while(ite.hasNext())
 {
	 System.out.println(ite.next().getText());//get Text method used to get the text for seleted elements which are present in list.
 }
 
 System.out.println("===========================================");
WebElement fs = s.getFirstSelectedOption();// GetFirstSelected Optionto method show only one selected elements
System.out.println("Resut of firstSelected element text "+fs.getText());// get Text method used to get the text for seleted element

List<WebElement> ge = s.getOptions();// to show all elements which are present in list
System.out.println("====Traversing through  for each loop========");
for(WebElement ab:ge)
	{
	System.out.println(ab.getText());
}



	}

}

	


