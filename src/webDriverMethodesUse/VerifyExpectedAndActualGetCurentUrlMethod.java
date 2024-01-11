package webDriverMethodesUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyExpectedAndActualGetCurentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		String Expected_Url="https://www.paytmmoney.com/";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.paytmmoney.com/");
     Thread.sleep(2000);
        String Actual_url = driver.getCurrentUrl();
       System.out.println("Actual_url"+Actual_url);
       if(Expected_Url.equals(Actual_url))
       {
    	System.out.println("Expected and Actual title are same ");
       }
       else  
       {
    	 System.out.println("Expected and Actual title are not same ");
       }
	}

}


