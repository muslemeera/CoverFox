package scrollingSudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByJavaExecuterUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.naukri.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//1.step we have to casting first driver into JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor)driver;
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,700)");
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,2700)");
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,3000)");
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,-2000)");
	}

}
