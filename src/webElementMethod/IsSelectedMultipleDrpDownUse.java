package webElementMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class IsSelectedMultipleDrpDownUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(1000);
		// Process to handle list box/dropdown (Verify tag name of dropdown/listbox is
		// 🡪select)
		//1. Identify list box to be handled and store it in reference variable

		WebElement multiselect = driver.findElement(By.name("selenium_commands"));
		//2.Create an object of Select class which will accept WebElement as argument

		Select s = new Select(multiselect);

		{
			System.out.println("can we select multiple option " + s.isMultiple());
		}
		//3.By using one of the select class methods we can select values form list box like 
		//1. selectByVisibleText: selectByVisibleText(String arg0) 
		//2. selectByIndex: selectByIndex(int arg0) 
		//3. selectByValue: selectByValue(String arg0)

		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByVisibleText("Navigation Commands");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByVisibleText("Wait Commands");
		Thread.sleep(1000);
		// deselect mehod
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectByVisibleText("Wait Commands");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByVisibleText("Wait Commands");
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.deselectAll();

	}

}
