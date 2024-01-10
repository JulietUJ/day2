package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fbtest()
	{
		WebElement searchbutton=driver.findElement(By.name("q"));
		searchbutton.sendKeys("books");
		searchbutton.submit();
		//OR
		//driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
	//OR
		//driver.findElement(By.name("btnK")).click();
	}
}
