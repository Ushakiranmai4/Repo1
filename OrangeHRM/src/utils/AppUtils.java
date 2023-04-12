package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtils 
{
	
	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com";
	@BeforeTest
	public static void launchApp()
	{
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterTest
	public static void closeapp()
	{
		driver.close();
	}

}
