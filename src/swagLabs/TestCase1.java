package swagLabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement usernameField = driver.findElement(By.id("user-name"));
		WebElement passwordField = driver.findElement(By.name("password"));
		 
		usernameField.sendKeys("standard_user") ;
		passwordField.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
 WebElement saucelabsbackpack = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));

 WebElement saucelabsbikelight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
 saucelabsbackpack.click();	
 saucelabsbikelight.click();
 WebElement cartButton = driver.findElement(By.className("shopping_cart_badge"));
	cartButton.click();
 List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
 System.out.println("no of cart items"+cartItems.size());
 for(WebElement cr:cartItems)
 {
	 System.out.println("Items arecr"+cr.getText());
 }
 // validates iteam is same as what we want
Iterator<WebElement> it = cartItems.iterator();
WebElement itemNo1 = it.next();
if(itemNo1.getText().equals("Sauce Labsback Pack"))
{
	System.out.println(" selected iteam  is correct as==>Sauce Labsback Pack ");
	WebElement checkOutButton = driver.findElement(By.id("checkout"));
	checkOutButton.click();
		
}
else
{
	System.out.println(" selected items are not correct");
	
}
// put your name lastname and zip code
	
		
		WebElement Firstname = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		Firstname.sendKeys("Velocity");
		lastName.sendKeys("Pune");
		postalCode.sendKeys("411046");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();
		WebElement ThankYouMassage = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
		if(ThankYouMassage.getText().equals("Thank you for your order!"))
		{
		System.out.println(" thank you massage is displayed ---logging out");
		
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(500);
		
	 driver.findElement(By.id("logout_sidebar_link")).click();
		}
		else
		{
			System.out.println("thank you massage is not displayed please check");
		}
		
	}
	
}
