package locatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByAttributeUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/about-us");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
	}

}
