package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demotest
{
	@Parameters({"browser"})
	@Test 
	public void checkLogin(String br) throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName(br);
		URL url=new URL("http://192.168.1.5:4444/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://facebook.com");
	}

}

