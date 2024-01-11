package pomCoverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {
	
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement pinCodeField;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobileNomField;
	
	@FindBy(xpath="//div[text()='Continue']")private WebElement continueButton;
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	public void enterPinCodeField()
	{
		pinCodeField.sendKeys("431714");
	}
	public void enterMobileNomField()
	{
		mobileNomField.sendKeys("8698213123");
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
	