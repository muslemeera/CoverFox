package popupsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopupsdStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		    driver.get("https://www.flipkart.com/");
		    Thread.sleep(1000);
     driver.findElement(By.xpath("//span[@role='button']")).click();
     Thread.sleep(1000);
     driver.findElement(By.name("q")).sendKeys("laptop");	
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@ type='text']")).click();     
	}

}
