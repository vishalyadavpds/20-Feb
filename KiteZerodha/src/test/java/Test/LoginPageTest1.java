package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;

public class LoginPageTest1 {
	WebDriver driver;
		
		@BeforeMethod
		public void browser() {
			driver = Browser2.openBrowser();
		}
		
		@Test
		public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException        {
			ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
			String userName = Parametrization.getData( 0, 1);
			String password = Parametrization.getData( 1, 1);
			zerodhaLoginPage.enterUserID(userName);
			zerodhaLoginPage.enterPassword(password);
			zerodhaLoginPage.clickOnLogin();
			
		}
			
		@Test
		public void forgotPasswordLinkTest()   {
			ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgotPassword();
		}
		
		@Test
		public void signupLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUp();
			driver.getWindowHandles();
			
			
		}
		
		
}



