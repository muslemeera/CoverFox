package pomCoverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	// make it variable as private
@ FindBy(xpath="//div[text()='Male']")  private WebElement MailButton;
// constructure
public CoverFoxHomePage(WebDriver driver)
{
PageFactory.initElements(driver,this);

// method
}
public void clickOnMailButton()
{
	MailButton.click();
}

	
	
	

}

