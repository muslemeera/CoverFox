package webDriverMethodesUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseMaximizeMinizeCloseWebDriverMethodStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.manage().window().minimize();
       Thread.sleep(5000);
      driver.close();
	}

}
