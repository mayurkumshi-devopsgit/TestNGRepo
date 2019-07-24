package comproject.selenium.seleniumMVN011;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGProgramDemo1 {

	WebDriver driver;

	@Test
	public void LoginCheck() throws Exception {
		// ChromeOptions optionsBeta = new ChromeOptions();

		// System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/workspace/TestNGJenkins/chromedriver");
		// optionsBeta.setBinary("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		options.addArguments("--headless");
		options.addArguments("start-maximized"); // open Browser in maximized
													// mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		// options.addArguments("--disable-gpu"); // applicable to windows os
		// only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited
															// resource problems
		 // Bypass OS security model
		driver = new ChromeDriver(options);

		driver.get("https://google.com");
		driver = new ChromeDriver();
		System.out.println("Opening the URL");
		driver.get("http://google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven dependency");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']//preceding::center")).click();

		Thread.sleep(5000);

		String url = driver.getCurrentUrl();

		String url2 = "https://mvnrepository.com/";

		System.out.println(" " + url);

		Assert.assertEquals(url, url2);

		driver.close();

	}

}
