package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownIsSelectedUse {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			//1//How to handle drop down
			//selecting dropdownfield
			//1. Identify list box to be handled and store it in reference variable
			WebElement dropdownfield = driver.findElement(By.id("dropdown-class-example"));
			Thread.sleep(2000);
			//2
			Select s= new Select(dropdownfield);
			//3.
			s.selectByValue("option2");

	}

}
