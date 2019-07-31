package comproject.selenium.seleniumMVN011;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNGArrayList

{
	
	WebDriver driver;
	
	@Test
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximised");
		driver = new ChromeDriver(option);
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	    driver.findElement(By.id("searchDropdownBox")).click();
	    
	    List<WebElement> optionCount = driver.findElements(By.xpath("//select//option"));
	    List<WebElement> arraylist = new ArrayList<WebElement>();
	    System.out.println(" "+optionCount.size());
	    
	    System.out.println("Elements in dropdown are");
	   
	    Iterator<WebElement> iterator = optionCount.iterator();
	    
	    while(iterator.hasNext())
	    {
	    	System.out.println("\n" +iterator.next().getText());
	    	arraylist.add(iterator.next());
	    }
	}	  
	    
	@Test
	public void search()
	{
		List<WebElement> options = driver.findElements(By.xpath("//select//option"));
		Random rand = new Random();
		int list = rand.nextInt(options.size());
		options.get(list).click();
		
		String randomcategory = options.get(list).getText();
		
		System.out.println(" "+randomcategory);
		
		
	}
      
}
		


