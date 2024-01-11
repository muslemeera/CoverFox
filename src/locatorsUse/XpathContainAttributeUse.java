package locatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainAttributeUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//Xpath Contain Attribute Use
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		
	}

}
