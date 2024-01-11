package webDriverMethodesUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentMethodUse {

	public static void main(String[] args) throws InterruptedException {
		//getCurrentURL- this method is use to get URL of a webpage. 
		//return type of getCurrentURL method is String
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(400);
		 String url = driver.getCurrentUrl();
		System.out.println("Url is "+url);


	}

}
