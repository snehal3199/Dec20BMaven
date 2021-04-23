package Module4_Test_Login;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Module4_Login.HomePage;
import Module4_Login.Login1Page;
import Module4_Login.Login2Page;
import Module4_Login.ProfilePage;
import junit.framework.Assert;

public class LoginTestNG 
{

	Login1Page login1;
	Login2Page login2;
	HomePage home;
	ProfilePage profile;
	Sheet sh;
	WebDriver driver;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream file = new FileInputStream("F:\\Velocity\\Selenium_Webdriver\\Selenium Excell sheet.xlsx");
		  sh = WorkbookFactory.create(file).getSheet("DDF");

		System.setProperty("webdriver.chrome.driver",
				"F:\\Velocity\\Selenium_Webdriver\\Selenium_files\\chromedriver.exe" );
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);

		login1 = new Login1Page(driver);
		login2 = new Login2Page(driver);
		home = new HomePage(driver);
		profile = new ProfilePage(driver);

	}

	@BeforeMethod
	public void loginToApp() {
		login1.setKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.setKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLogin1PageLoginBtn();
		login2.setKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickKiteLogin2PageCntBtn();
	}

	@Test
	public void verifyPN() 
	{
		String actPN = home.getKiteHomePagePN();
		String expPN=sh.getRow(0).getCell(3).getStringCellValue();
		
		System.out.println("actPN "+actPN);
		System.out.println("expPN "+expPN);
		
		Assert.assertEquals(actPN, expPN, "act & exp results are diff");
	}

	@AfterMethod
	public void logoutFromApp() {
		home.clickKiteHomePagePN();
		profile.clickKiteProfilePageLogOutBtn();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	
	
}
