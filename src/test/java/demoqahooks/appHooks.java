package demoqahooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import DemoqadriverConfig.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class appHooks 
{
	public  WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException
	{
		String path=	System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
System.out.println(path);
FileInputStream file=new FileInputStream(path);

	Properties p=new Properties();
	p.load(file);
	
	String browser=p.getProperty("browser");
	
	System.out.println(browser);
	
	DriverFactory df=new DriverFactory();
	driver=df.initBrowser(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@After
public  void closeBrowser()
{
driver.quit();
}

}