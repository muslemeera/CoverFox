package misceliniousStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> SearchResult = driver.findElements(By.xpath("//div[@class='OBMEnb'][1]/ul/li"));
		//For each loop
		for (WebElement Ser:SearchResult)
		{
			System.out.println(Ser.getText());
		}
		System.out.println("=====================================");
		Thread.sleep(1000);
		 String ExpectedResut = "honda elevate";
		 Thread.sleep(1000);
		 for(WebElement se:SearchResult)
		 {
			  String ActualResult = se.getText();
		if (ActualResult.equals(ExpectedResut))
		{
			se.click();
			break;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		 }	
		 }	 	
}

