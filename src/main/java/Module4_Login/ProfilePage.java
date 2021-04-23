package Module4_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
	//step 1(logout inspect)
			@FindBy(xpath="//a[text()=' Logout']") private WebElement logout;
			
		//step2	
			public ProfilePage(WebDriver driver) 
			{
				PageFactory.initElements(driver,this);
			}
			
		//step3
			public void clickKiteProfilePageLogOutBtn()
			{
				logout.click();
			}
		
		
}
