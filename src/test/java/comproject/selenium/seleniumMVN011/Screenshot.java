package comproject.selenium.seleniumMVN011;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Screenshot

{
	String browsername;
	WebDriver driver;

	@Parameters(value = "browsername")
	@Test
	public void OpenChrome(String browser) throws IOException {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://google.com");
			System.out.println("Chrome Browser Opened " + driver.getTitle());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			TakesScreenshot scrshot = ((TakesScreenshot) driver);
			File srcfile = scrshot.getScreenshotAs(OutputType.FILE);

			File destfile = new File(
					"C:\\Users\\mayur.kumshi\\Desktop\\Selenium\\Project2\\seleniumMVN011\\ChromeGoogleHome.png");

			FileUtils.copyFile(srcfile, destfile);
			System.out.println("Screenshot Copied");

			driver.close();
		}

	}
	
	@Parameters(value = "browsername1")
	@Test
	public void OpenFirefox(String browser1) throws IOException
	{
		if(browser1.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://google.com");

			System.out.println("FireFox browser Opened"+ driver.getTitle());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			
			TakesScreenshot scrshot = ((TakesScreenshot)driver);
			File source = scrshot.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("C:\\Users\\mayur.kumshi\\Desktop\\Selenium\\Project2\\seleniumMVN011\\FirefoxGoogleHome.png");
		
			FileUtils.copyFile(source, destination);
			
			
			System.out.println("Screenshot for Firefox copied");
		
			driver.close();
		}
	}

}
