package seleniumFirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUse {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");	
	}

}
