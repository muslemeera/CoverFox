package chromeOptionsClassStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("--headless");
//opt.addArguments("incognito");
//opt.addArguments("-disable-notifications");
//opt.addArguments("start-maximized");
ArrayList<String>al=new ArrayList<>();
al.add("incognito");
al.add("-disable-notifications");
al.add("start-maximized");
opt.addArguments(al);
WebDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
Thread.sleep(1000);
driver.get("https://www.justdial.com");
Thread.sleep(1000);
System.out.println(driver.getTitle());

	}

}
