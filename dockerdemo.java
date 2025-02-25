package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dockerdemo 
{
public static void main(String[] args) throws MalformedURLException, InterruptedException 
{

//Running the script on docker --> execution will be on virtual machine hence we are not seeing any browser opening 
	
	//STANDALONE mode
	DesiredCapabilities dc=new DesiredCapabilities();
	
	dc.setBrowserName("firefox");
	//For chrome: chrome
	//For edge: MicrosoftEdge
	//For firefox: firefox
	
	WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"), dc);
	
	driver.manage().window().maximize();

	driver.get("https://demoqa.com/automation-practice-form");
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(3000);
	
	driver.close();
	
	
}
}
