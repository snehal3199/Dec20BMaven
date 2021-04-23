package Module4_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//step1:declaration(profile name)
			@FindBy(xpath="//span[text()='KV']") private WebElement PN;
			
			//step2:Initialization
			public HomePage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			//method with return type
			//step3:usage
			public String getKiteHomePagePN()
			{
				String actPN = PN.getText();
				
				return actPN;
				
			}		
			//profile name(page click)	
				public void clickKiteHomePagePN() 
				{
					PN.click();
				}
		
		
	
	
	
	
}
