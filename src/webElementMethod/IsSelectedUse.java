package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains( @ id,'u_0_0')]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@ value='1']")).click();
		// Thread.sleep(2000);
		// boolean result = driver.findElement(By.xpath("//input[@
		// value='1']")).isSelected();
		{
			// System.out.println("Female status result "+ result);
		}
		// driver.findElement(By.xpath("//input[@ value='2']")).click();
		// boolean Res = driver.findElement(By.xpath("//input[@
		// value='2']")).isSelected();
		{
			// System.out.println("Female status result "+ Res);
		}
		// code optimization-
		WebElement FemaleGender = driver.findElement(By.xpath("//input[@ value='1']"));
		boolean result = FemaleGender.isSelected();
		{
			System.out.println(" femaleGender selection status is " + result);
		}
		FemaleGender.click();
		boolean result1 = FemaleGender.isSelected();
		{
			System.out.println(" femaleGender selection status is " + result1);
		}

	}
}