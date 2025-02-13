package Demoqapages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Demoqa_PracticeForm 
{
WebDriver driver;
Select s;
JavascriptExecutor js;

@FindBy  (xpath="//input[@id='firstName']") WebElement firstName;
@FindBy  (xpath="//input[@id='lastName']") WebElement lastname;
@FindBy  (xpath="//input[@id='userEmail']") WebElement email;

@FindBy  (xpath="//label[text()='Male']") WebElement males;
@FindBy  (xpath="//label[text()='Female']") WebElement females;

@FindBy  (xpath="//input[@id='userNumber']") WebElement mobileNumber;

@FindBy  (xpath="//form[@id='userForm']/div[5]") 
WebElement DOBInput;

@FindBy  (xpath="//select[@class='react-datepicker__year-select']") 
WebElement dateOfBirthYear;

@FindBy  (xpath="//select[@class='react-datepicker__month-select']") 
WebElement dateOfBirthMonth;

@FindBy  (xpath="//div[@class='react-datepicker__day react-datepicker__day--015']") 
WebElement dateOfBirthDay;

@FindBy  (xpath="//form[@id='userForm']/div[@id='subjectsWrapper']/div[@class='col-md-9 col-sm-12']") 
WebElement subject;

@FindBy  (xpath="id=\"subjectsContainer\"") 
WebElement subjectTextbox;

@FindBy  (xpath="(//label[@class='custom-control-label'])[4]") 
WebElement sports;

@FindBy  (xpath="(//label[@class='custom-control-label'])[5]") WebElement reading;
@FindBy  (xpath="(//label[@class='custom-control-label'])[6]") WebElement music;

@FindBy  (xpath="//textarea[@id='currentAddress']") WebElement currentAddress;
@FindBy  (xpath="//div[@id='state']") WebElement state;
@FindBy  (xpath="//div[text()='Uttar Pradesh']") WebElement UP;
//(//div[@class=' css-tlfecz-indicatorContainer'])[2]

@FindBy  (xpath="//div[@id='city']") WebElement city;
@FindBy  (xpath="//div[text()='Lucknow']") WebElement lck;


@FindBy (xpath = "//button[@id='submit']") WebElement submit;
@FindBy (xpath = "//div[text()='Thanks for submitting the form']") WebElement submittedForm;


public POM_Demoqa_PracticeForm (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.js=(JavascriptExecutor)driver;
}





public void enterFN(String FN) 
{
firstName.sendKeys(FN);	
}

public void enterLN(String LN) 
{
lastname.sendKeys(LN);	
}

public void enterEmail(String emailid) 
{
email.sendKeys(emailid);	
}

public void selectGendermale() 
{ 
	js.executeScript("arguments[0].scrollIntoView();", males);
	males.click();	
}
public void selectGenderfemale() 
{ 
	js.executeScript("arguments[0].scrollIntoView();", females);
	females.click();		
}

public void enterMobile(String mob) 
{
mobileNumber.sendKeys(mob);	
}

public void Click_DOB() throws InterruptedException 
{
	 if (js != null) {
		 js.executeScript("arguments[0].scrollIntoView();", DOBInput);
     } else {
         System.out.println("JavascriptExecutor is not initialized.");
     } 
	
	//js = (JavascriptExecutor)driver;

	
	
	DOBInput.click();
	
	//Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	
	Thread.sleep(3000);
}



public void selectYear(String year) throws InterruptedException 
{
	// driver=null;
	
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	
//	js.executeScript("arguments[0].scrollIntoView();", dateOfBirthYear);

	Thread.sleep(2000);	
	
	s=new Select(dateOfBirthYear);
	s.selectByContainsVisibleText(year);
	
}

public void selectMonth(String month) 
{
	 s=new Select(dateOfBirthMonth);
	 s.selectByContainsVisibleText(month);
	
	 
}

public void selectDay(String day) 
{
//dateOfBirthDay.click();
//List<WebElement> days = driver.findElements(By.xpath("//div[@class='react-datepicker']//div[@class='react-datepicker__month']//div"));
//	switch(day)
//	{
//	case "1": driver.findElement(By.xpath("//div[text()='1']")).click();	
//	break;
//	case "2": driver.findElement(By.xpath("//div[text()='2']")).click();	
//	break;
//	case "3": driver.findElement(By.xpath("//div[text()='3']")).click();	
//	break;
//	case "4": driver.findElement(By.xpath("//div[text()='4']")).click();	
//	break;
//	case "5": driver.findElement(By.xpath("//div[text()='5']")).click();	
//	break;
//	case "6": driver.findElement(By.xpath("//div[text()='6']")).click();	
//	break;
//	case "7": driver.findElement(By.xpath("//div[text()='7']")).click();	
//	break;
//	case "8": driver.findElement(By.xpath("//div[text()='8']")).click();	
//	break;
//	case "9": driver.findElement(By.xpath("//div[text()='9']")).click();	
//	break;
//	case "10": driver.findElement(By.xpath("//div[text()='10']")).click();	
//	break;
//	case "11": driver.findElement(By.xpath("//div[text()='11']")).click();	
//	break;
//	case "12": driver.findElement(By.xpath("//div[text()='12']")).click();	
//	break;
//	case "13": driver.findElement(By.xpath("//div[text()='13']")).click();	
//	break;
//	case "14": driver.findElement(By.xpath("//div[text()='14']")).click();	
//	break;
//	case "15": driver.findElement(By.xpath("//div[text()='15']")).click();	
//	break;
//	case "16": driver.findElement(By.xpath("//div[text()='16']")).click();	
//	break;
//	case "17": driver.findElement(By.xpath("//div[text()='17']")).click();	
//	break;
//	case "18": driver.findElement(By.xpath("//div[text()='18']")).click();	
//	break;
//	case "19": driver.findElement(By.xpath("//div[text()='19']")).click();	
//	break;
//	case "20": driver.findElement(By.xpath("//div[text()='20']")).click();	
//	break;
//	case "21": driver.findElement(By.xpath("//div[text()='21']")).click();	
//	break;
//	case "22": driver.findElement(By.xpath("//div[text()='22']")).click();	
//	break;
//	case "23": driver.findElement(By.xpath("//div[text()='23']")).click();	
//	break;
//	case "24": driver.findElement(By.xpath("//div[text()='24']")).click();	
//	break;
//	case "25": driver.findElement(By.xpath("//div[text()='25']")).click();	
//	break;
//	case "26": driver.findElement(By.xpath("//div[text()='26']")).click();	
//	break;
//	case "27": driver.findElement(By.xpath("//div[text()='27']")).click();	
//	break;
//	case "28": driver.findElement(By.xpath("//div[text()='28']")).click();	
//	break;
//	case "29": driver.findElement(By.xpath("//div[text()='29']")).click();	
//	break;
//	case "30": driver.findElement(By.xpath("//div[text()='30']")).click();	
//	break;
//	case "31": driver.findElement(By.xpath("//div[text()='31']")).click();	
//	break;
//
//	}
}

public void enter_subject() 
{

	
js.executeScript("arguments[0].scrollIntoView();", subject);
	
	subject.sendKeys("General");	
}

public void selectHobbiesSports() 
{
sports.click();	
}

public void selectHobbiesReading() 
{
reading.click();	
}

public void selectHobbiesMusic() 
{
music.click();	
}

public void enterAddress()
{
	currentAddress.sendKeys("Ahmedabad");
}

public void selectState() throws InterruptedException
{
	state.click();
	Thread.sleep(1000);
	UP.click();
	Thread.sleep(2000);
}

public void selectCity() throws InterruptedException
{	
	Thread.sleep(3000);
	city.click();
	lck.click();
	Thread.sleep(3000);
}

public void clickSubmit()
{
submit.click();
}

public String verifySubmissionForm()
{
	String acttext=submittedForm.getText();
	return acttext;
}
}
