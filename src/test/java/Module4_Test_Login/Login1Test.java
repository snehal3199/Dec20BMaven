package Module4_Test_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login1Test 
{

	@Test
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Velocity\\Selenium_Webdriver\\Selenium_files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
