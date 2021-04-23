package Module4_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page 
{

	//step1:declaration
	@FindBy(xpath="//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement CntBtn;
	
	//step2:Initialization
	public Login2Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3:usage
	 //enter pin
	public void setKiteLogin2PagePin(String pinValue)
	{
		Pin.sendKeys(pinValue);
	}
	//click on continue button
	public void clickKiteLogin2PageCntBtn()
	{
		CntBtn.click();
	}




	
	
	
}
