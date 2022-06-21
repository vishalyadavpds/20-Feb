package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {
	public static WebDriver openBrowser()  {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing Course Materials\\Software\\Selium Tool Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting Chrome driver class to webdriver
		driver.get("https://Kite.zerodha.com/");//method of webdriver interface
		driver.manage().window().maximize();
		return driver;
   }

}


