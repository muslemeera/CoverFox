package webDriverMethodesUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethodUse {

	public static void main(String[] args) throws InterruptedException {
//getTitle: this method is use to get title of a webpage.
		//return type of getTitle method is String.
		WebDriver driver =new ChromeDriver();
				driver.get("https://vctcpune.com/");
					Thread.sleep(300);
					String Title = driver.getTitle();
					System.out.println("Title is "+Title);
                      Thread.sleep(2000);
        driver.navigate().to("https://www.naukri.com/nlogin/login");
        Thread.sleep(2000);
        String name = driver.getTitle();
		System.out.println("Title is "+name);  
		
	}

}
