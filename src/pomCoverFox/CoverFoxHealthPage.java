package pomCoverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPage {

	@FindBy(className="next-btn") private WebElement nextButtOnHealthpage;

	public CoverFoxHealthPage(WebDriver driver)
{
	PageFactory.initElements(driver ,this);	

	}
	public void ClickOnNextHealthButton()
	{

		nextButtOnHealthpage.click();
	
	
	
	}

}
