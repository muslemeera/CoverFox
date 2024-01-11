package webElementMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelectedMethodDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/ ");
		driver.findElement(By.linkText("Create new account")).click();
       Thread.sleep(2000);
     //How to handle drop down
		//selecting date
		
       WebElement date = driver.findElement(By.id("day"));
      Select s =new Select(date);
      s.selectByValue("12");
      Thread.sleep(2000);
    //1. Identify list box to be handled and store it in reference variable
      WebElement month = driver.findElement(By.name("birthday_month"));
   // 2. Create an object of Select class which will accept WebElement as argument
     Select smonth =new Select(month);
  // 3. By using one of the select class methods we can select values form list box like
   //sDay.selectByIndex();
   //sDay.selectByValue("");
      smonth.selectByValue("6");
     Thread.sleep(2000);
      
      WebElement year = driver.findElement(By.id("year"));
     
      Select syear =new Select(year);
      syear.selectByVisibleText("2012");
      Thread.sleep(2000);
      
	} 
       
}  
       

       
	


