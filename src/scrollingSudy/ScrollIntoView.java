package scrollingSudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.naukri.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement SponsoredCompanies = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
		//1.step we have to casting first driver into JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor)driver;
Thread.sleep(2000);
js.executeScript("arguments[0].scrollIntoView();",SponsoredCompanies );
Thread.sleep(2000);
WebElement myElement = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
 js.executeScript("arguments[0].scrollIntoView();", myElement);
 File sr = myElement.getScreenshotAs(OutputType.FILE);
 File des = new File("E:\\My Screenshot pic\\My Screenshot pic.png");
 FileHandler.copy(sr, des);
	}

}
