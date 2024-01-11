package locatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainTextUse1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/ ");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("meera@gail.com");
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		//driver.findElement(By.xpath("")).sendKeys(args);
	

}
}