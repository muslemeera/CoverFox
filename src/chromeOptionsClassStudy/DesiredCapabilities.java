package chromeOptionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilities {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"," E:\\My Screenshot pic\\chromedriver.exe");
		// create a object of chrome options
		ChromeOptions opt = new ChromeOptions();
		// call method add arguments and add desired options
		//opt.addArgument("--disable notification");
		opt.addArguments("Disable-infobars");
		WebDriver driver = new ChromeDriver(opt);
		//driver.manage().window().maximize();
		driver.get("https://www.justdial.com");
		Thread.sleep(1000);
		 String myText = driver.findElement(By.xpath("//h2[text()='Popular Searches']")).getText();
		
		 System.out.println("text is" +myText);
	}

}
