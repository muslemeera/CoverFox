package screenshotStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUse {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		File sorce = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\My Screenshot pic\\My Screenshot pic.png");
		FileHandler.copy(sorce, destination);

	}
}

