package setSizeandSetPositionBrouserStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeBrouserStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.discovery.com");
		Thread.sleep(1000);
		
		Dimension DefaultSize = driver.manage().window().getSize();
System.out.println(DefaultSize);
Thread.sleep(1000);
// to create a dimention class opject

Dimension d =new Dimension(100, 50);
Thread.sleep(2000);
driver.manage().window().setSize(d);

Dimension d1 =new Dimension(200, 150);
Thread.sleep(2000);
driver.manage().window().setSize(d1);

Dimension d2 =new Dimension(500, 700);
Thread.sleep(2000);
driver.manage().window().setSize(d2);




	}

}
