package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	@Before
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		Thread.sleep(100000);	
	
		}
	@Test
	public void Amazontest()
	{
		WebElement searchbutton=driver.findElements(By.xpath("//*[@id='twotabsearchtextbox']"));
		searchbutton.sendKeys("mobiles");
		searchbutton.submit();
		
		
		
	}
}
