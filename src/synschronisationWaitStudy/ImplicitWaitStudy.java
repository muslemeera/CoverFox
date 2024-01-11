package synschronisationWaitStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upstox.com");
		//Thread.sleep(10000);//
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	}


