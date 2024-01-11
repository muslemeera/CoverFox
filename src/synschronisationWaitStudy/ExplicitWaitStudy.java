package synschronisationWaitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		WebElement GetOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(6000));
	
	driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("8698213256");
	
	w.until(ExpectedConditions.elementToBeClickable(GetOtpButton));
	
	GetOtpButton.click();
	}
}
