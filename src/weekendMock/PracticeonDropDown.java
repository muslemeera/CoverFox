package weekendMock;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeonDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
Thread.sleep(1000);
 WebElement multiselected = driver.findElement(By.xpath("//select[@id='second']"));

Select s = new Select((WebElement) ( multiselected));
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
 System.out.println("Resut of firstSelected element text "+s.getFirstSelectedOption().getText());// GetFirstSelected Optionto method show only one selected elements
 // get Text method used to get the text for seleted element
System.out.println("===========================================");
List<WebElement> ge = s.getOptions();// to show all elements which are present in list

System.out.println("====Traversing through  for each loop========");
for(WebElement ab:ge)
	{
	System.out.println(ab.getText());
}
System.out.println("====Traversing through  for loop====");
for(int i=0;i<=ge.size()-1;i++)
{
	System.out.println(ge.get(i).getText());
}
System.out.println("====Traversing through List Iterator========");
ListIterator<WebElement> lit = ge.listIterator();

while(lit.hasNext())
{
	 System.out.println(lit.next().getText());
}



	}

}
