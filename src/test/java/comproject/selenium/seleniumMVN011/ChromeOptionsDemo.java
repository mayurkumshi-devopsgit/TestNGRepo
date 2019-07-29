package comproject.selenium.seleniumMVN011;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionsDemo

{

	WebDriver driver;

	@Test
	public void ChromeoptionsUse() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("start-maximised");

		driver = new ChromeDriver(options);

		driver.get("https://google.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Browser Opened");

		driver.close();

		options.addArguments("incognito");

		driver = new ChromeDriver(options);

		driver.get("https://gmail.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Browser Opened " + driver.getTitle());

		driver.close();

		options.addArguments("headless");

		driver = new ChromeDriver(options);

		driver.get("https://gmail.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Browser Opened " + driver.getTitle());

		driver.close();
	}
}
