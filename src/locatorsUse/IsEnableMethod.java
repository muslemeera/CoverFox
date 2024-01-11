package locatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//Boolean Result=driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
	// System.out.println(Result);
	 driver.findElement(By.id("mobileNumber")).sendKeys("9923425956");
	Boolean Res=driver.findElement(By.xpath("//button[text()='Get OTP']")).isDisplayed();
	 System.out.println(Res);
	}

}
