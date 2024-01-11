package misceliniousStudy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		//CommonlyUsedMethod.implicitWait(driver, 2);
		//CommonlyUsedMethod.takeScreenshot(driver, "amezontext");
		String value1 = CommonlyUsedMethod.readDataFromPropertyFile("RollNum");
		System.out.println(value1);
		String value2 = CommonlyUsedMethod.readDataFromPropertyFile("StudentName");
		System.out.println(value2);
		String value3 = CommonlyUsedMethod.readDataFromPropertyFile("MobileNum");
		System.out.println(value3);

	}

	}


