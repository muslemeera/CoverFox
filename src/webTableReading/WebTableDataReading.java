package webTableReading;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDataReading {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Only one heder reading
		 WebElement headername = driver.findElement(By.xpath("//table[@id='customers']//tr/th[2]"));
		 {
			 System.out.println(headername.getText());

// read hole row of header
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='customers']//tr[1]"));
		for(WebElement ta:tableHeader)
		{
			System.out.print(ta.getText()+" ");
		}
		System.out.println();
		System.out.println("===============================");
		// print only one data from table
		WebElement singleElement = driver.findElement(By.xpath(" //table[@id='customers']//tr[5]/td[2]"));
		System.out.println(singleElement.getText());
		System.out.println("===============================");
		//how to read complete row from table
		List<WebElement> completeRow = driver.findElements(By.xpath("//table[@id='customers']//tr[7]"));
		for(WebElement co:completeRow)
		{
			System.out.print(co.getText()+" ");
	}
		System.out.println();
		System.out.println("===============================");
		// how to read complete single column
		for(int i=1;i<=7;i++)
		{
	WebElement columnsdata = driver.findElement(By.xpath("//table[@id='customers']//tr/td[i]"));
		System.out.println(columnsdata.getText());
		}
		 }
	}}
