package comproject.selenium.seleniumMVN011;

import org.testng.annotations.Test;

public class TestNGPriority 
{

	@Test(priority=0)
	public void A()
	{
		System.out.println("A called now");
	}

	
	@Test(priority=-1)
	public void B()
	{
		System.out.println(" B Called now");
	}
	
	
	@Test(priority=-1)
	public void B1 ()
	{
		System.out.println("C Called now");
	}
	
	
	@Test(priority=2)
	public void D ()
	{
		System.out.println(" D Called now");
	}
}


