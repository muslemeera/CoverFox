package setSizeandSetPositionBrouserStudy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionBrouserStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.discovery.com");
		Thread.sleep(1000);
		
		Point DefaultPosition = driver.manage().window().getPosition();
		
		System.out.println(DefaultPosition);
		
		Point p=new Point(300, -120);
		Thread.sleep(2000);
	   driver.manage().window().setPosition(p);
	   
	   Point p1=new Point(400, -200);
		Thread.sleep(2000);
	   driver.manage().window().setPosition(p1);
	   
	   Point p2=new Point(-200, 150);
	   Thread.sleep(2000);
	   driver.manage().window().setPosition(p2);
	   

	}

}
