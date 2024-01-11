package webTableReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableStudy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
int noOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();

int noOfColumns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
System.out.println("============================================");
//for reading header only
 for(int h=1;h<=noOfColumns;h++)
{
	String data = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr[1]/th")).getText();
	System.out.print(data+ " ");
}
 System.out.println();
 System.out.println("================================================================");
 
 // table body reading
 
for( int i=1;i<=noOfRows-1;i++)
{
for(int j=1;j<=noOfColumns;j++)	
	
{
String bodyData = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+i+"]/td["+j+"]")).getText();
System.out.print(bodyData+ " ");
}
System.out.println();
System.out.println("=======================================================================");
}
	}
}
 
 
 
 
 
 
 
 


