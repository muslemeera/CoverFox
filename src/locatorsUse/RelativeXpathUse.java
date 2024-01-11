package locatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// relative x path
		driver.findElement(By.xpath("(//div/p[1][1]) ")).click();

	}

}
