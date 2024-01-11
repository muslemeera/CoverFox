package popupsStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://skpatro.github.io/demo/links/");
    Thread.sleep(1000);
driver.findElement(By.name("NewWindow")).click();
Set<String> AllWindows = driver.getWindowHandles();
System.out.println(AllWindows);
Iterator<String> it = AllWindows.iterator();
String mainPage = it.next();
String childWindow = it.next();
Thread.sleep(1000);
driver.switchTo().window(childWindow);
Thread.sleep(1000);
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("hellow everyone");
driver.close();
driver.switchTo().window(mainPage);
Thread.sleep(1000);





	}

}
