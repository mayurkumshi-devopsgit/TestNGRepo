package comproject.selenium.seleniumMVN011;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGProgramDemo1 
{

	WebDriver driver;
	

	@Test
	public void LoginCheck() throws Exception {

		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/plugins/chromedriver");
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
