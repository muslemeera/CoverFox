package locatorsUse;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//CSS selectors
		//Tag and ID-->css=tag#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("meera@1234");
		//Tag and Attribute -->css=tag[attribute=value]
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("meera#12*");
		//Tag and Class -->css=tag.class
		driver.findElement(By.cssSelector("button._42ft")).click();
		
		//Tag, Class, and Attribute----> css=tag.class[attribute=value]
		

		//https://www.naukri.com/nlogin/login

	}

}
