package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertboxpgm {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/Home/Downloads/alertpgm.html";
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void alerttest()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	if(alerttext.equals("hello!i am an alert bbox!"))
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
	}
	a.accept();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("ab");
	}
}
