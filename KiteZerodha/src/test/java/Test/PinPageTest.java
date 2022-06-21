package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class PinPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		 driver = Browser2.openBrowser();
		 
	}
	
	@Test
	public void loginToZerodhaWithPinTest() throws InterruptedException, EncryptedDocumentException, IOException    {
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	String userName = Parametrization.getData(0, 1);
	String password = Parametrization.getData(1, 1);
	zerodhaLoginPage.enterUserID(userName);
	zerodhaLoginPage.enterPassword(password);
	zerodhaLoginPage.clickOnLogin();
	Thread.sleep(5000);
	ZerodhaPinPage zerodhaPinPage  = new ZerodhaPinPage(driver);
	String pin = Parametrization.getData(2, 1);
	System.out.println(pin);
	zerodhaPinPage.enterPin(pin); 
	zerodhaPinPage .clickOnContinue();
   }

}
