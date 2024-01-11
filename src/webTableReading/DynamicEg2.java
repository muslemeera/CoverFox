package webTableReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicEg2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();

	}

}
//table[@border='1']/thead