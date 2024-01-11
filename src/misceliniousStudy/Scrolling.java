package misceliniousStudy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	
		public static void main(String[] args) throws IOException{
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			CommonlyUsedMethod.implicitWait(driver, 10);
			 WebElement Sponsoredcompanies = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
			 CommonlyUsedMethod.scrollIntoView(driver, Sponsoredcompanies);
			 CommonlyUsedMethod.takeScreenshot(driver, "naukariPic");
			
}

	
}

