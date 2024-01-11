package webTableReading;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEg1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// how many rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));	
         System.out.println("Total no of rows in table "+ rows.size());
      // how many columns in table
         List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
         System.out.println("Total no of columns in table "+columns.size() );
}
}