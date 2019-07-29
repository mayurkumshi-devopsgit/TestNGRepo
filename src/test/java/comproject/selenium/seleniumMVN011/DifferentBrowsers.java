package comproject.selenium.seleniumMVN011;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.internal.selenesedriver.TakeScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowsers
{
	WebDriver driver, driver1, driver2;
	
	
	String browsername,browsername1,browsername2;
	
	@Parameters(value="browsername")
	
	@Test
	public void OpenChrome(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Chrome Browser Opened "+ driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
		}
	}
	
	@Parameters(value="browsername1")
	@Test
	public void OpenFirefox(String browser1)
	{
		if(browser1.equalsIgnoreCase("firefox"))
		{
			
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);
		driver1 = new FirefoxDriver();
		driver1.get("https://google.com");
		System.out.println("Firefox Browser Opened "+ driver1.getTitle());
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.close();
		
}
	}
	
	
//	
	@Parameters(value="browsername2")
	@Test
	public void OpenIE(String browser2)
	{
		if(browser2.equalsIgnoreCase("IE")){
			
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		driver2 = new InternetExplorerDriver();
		driver2.get("https://google.com");
		System.out.println("Browser Opened "+ driver2.getTitle());
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver2.close();
	}

	}
}
