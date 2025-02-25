package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest 
{

@Test
public void HomePageCheck() throws MalformedURLException, InterruptedException
{
	DesiredCapabilities caps=new DesiredCapabilities();
	caps.setBrowserName("chrome");
//	caps.setPlatform(Platform.WINDOWS);
//	caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//	caps.setCapability(CapabilityType.BROWSER_NAME, true);
	
	
WebDriver driver=new RemoteWebDriver(new URL("http://192.168.8.97:4444"),caps);
driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("RS");
System.out.println("Google title: "+driver.getTitle()); 
Thread.sleep(5000);
driver.close();

}
}
