package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {

	public WebDriver setupChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
	public WebDriver setupMozilla()
	{
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
}
