package locatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTypeLocatorsGetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String expectedResult="Find your dream job now";
		String actualResult=driver.findElement(By.className("qsb-title")).getText();
		System.out.println(actualResult);
		if(expectedResult.equals(actualResult))
		{
			System.out.println("Text is maching TC is passed");
			
		}
		else
		{
			System.out.println("Text is  not maching TC is failed");
		}
	}
	}
