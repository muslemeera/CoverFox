package pomCoverFox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CF_TC555_ValidateSearchResultForHealthcarePolicies {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFoxHomePage home=new CoverFoxHomePage(driver);
		Thread.sleep(1000);
		home.clickOnMailButton();
		
		CoverFoxHealthPage health= new CoverFoxHealthPage(driver);
		Thread.sleep(2000);
		health.ClickOnNextHealthButton();
		
		CoverFoxMemberDetailsPage member=new CoverFoxMemberDetailsPage(driver);
		Thread.sleep(2000);
		member.handleAgeDropDown();
		member.clickOnNextButton();
		
		CoverFoxAddressDetailsPage address=new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(1000);
		address.enterPinCodeField();
		address.enterMobileNomField();
		address.clickOnContinueButton();
		
		CoverFoxResultPage result = new CoverFoxResultPage(driver);
		Thread.sleep(7000);
		result.validatePlanListWithResult();
		Thread.sleep(7000);
		driver.close();
		
	}	
	}


