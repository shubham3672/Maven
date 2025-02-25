package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSTest 
{
	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");	
//		caps.setPlatform(Platform.WINDOWS);
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.8.97:4444/wd/hub"),caps);
	driver.get("https://rahulshettyacademy.com");
	
	System.out.println("RSA title: "+driver.getTitle()); 
	driver.close();
	


	}
}




	