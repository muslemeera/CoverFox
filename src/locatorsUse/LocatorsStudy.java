package locatorsUse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStudy {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://meet.google.com/");
	//driver.get("https://www.naukri.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@jsname='KS83le']")).click();
	//driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();


	}	
}

//"//div[@class='mobgod']"