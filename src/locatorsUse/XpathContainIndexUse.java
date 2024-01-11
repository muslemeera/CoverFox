package locatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainIndexUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@ type='text'])[2]")).sendKeys("pune");

	}

}
