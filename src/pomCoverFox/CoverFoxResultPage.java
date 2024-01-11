package pomCoverFox;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {
	@FindBy(xpath="//div[contains(text(),'Health Insurance Plans')]")private WebElement resultInString;
@FindBy(id="plans-list")private List <WebElement> planlist;

public CoverFoxResultPage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
	}
public void validatePlanListWithResult()
{
	String test = resultInString.getText();
	// 49 matching of helth insurence plans
	String ar[]=test.split("");
	String numberOfResultInString=ar[0];//49--->String
	//convert String in to integer
	int numberOfResultInInt = Integer.parseInt(numberOfResultInString);//49 ---> in number (int)
	int totalNumberOfPlans=planlist.size();
	if(totalNumberOfPlans==numberOfResultInInt)
	{
		System.out.println("plans number matching with plans list,Test Case is passed");
	}
	else
	{
		System.out.println("plans number is not matching with plans list,Test Case is faied");
		
	}	
		
		
		
		
	}
}


