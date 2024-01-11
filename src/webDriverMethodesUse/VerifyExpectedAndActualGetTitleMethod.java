package webDriverMethodesUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyExpectedAndActualGetTitleMethod {

	public static void main(String[] args) {
		String Expected_title = " Google";
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
		String Actual_Title = driver.getTitle();
		System.out.println(Actual_Title);
if(Expected_title.equals(Actual_Title))
{
	System.out.println("Expected and Actual title are same ");
}
else
{
	System.out.println("Expected and Actual title are not same ");
}
	}

}
