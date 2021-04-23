package Module4_Login;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page 
{
	//step1:declaration
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement Pwd;
	@FindBy(xpath="//button[@type='submit']") private WebElement Login;

//step2:Initialization
public Login1Page(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}

//step3:Usage

//enter UN
public void setKiteLogin1PageUsername(String Username)
{
	UN.sendKeys(Username);
}
//enter pwd
public void setKiteLogin1PagePassword(String password)
{
	Pwd.sendKeys(password);
}
//click on login button
public void clickKiteLogin1PageLoginBtn()
{
	Login.click();
}



	
	
}
