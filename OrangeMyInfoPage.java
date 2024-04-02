package PagePackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeMyInfoPage
{
	public OrangeMyInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@name='username']")
	WebElement user;
	@FindBy(xpath="//input[@name='password']")
	WebElement pass;
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	GenericKeywordsWithPage keys=new GenericKeywordsWithPage("OrangeMyInfoPage");

	public void username(String user1)
	{
		keys.enterData(user, user1);
	}
	public void password(String pass1)
	{
		keys.enterData(pass, pass1);
	}
	public void log()
	{
		keys.click(login);
	}
	
	@FindBy(xpath="//span[text()='My Info']")
	WebElement myinfo;
	@FindBy(xpath="//a[text()='Personal Details']")
	WebElement personal;
	
	public void myinfo()
	{
		keys.click(myinfo);
	}
	public void personal()
	{
		keys.click(personal);
	}

//	@FindBy(xpath="//input[@name='firstName']")
//	WebElement first;
//	
	public void firstname(String first1) throws InterruptedException
	{
		WebElement first=keys.driver.findElement(By.xpath("//input[@name='firstName']"));
		first.click();
		Actions act=new Actions(keys.driver);
		act.doubleClick(first).perform();
		Thread.sleep(4000);
		keys.enterData(first, first1);
	}
	
	public void middle(String middle1) throws InterruptedException
	{
		Actions act=new Actions(keys.driver);
		WebElement middle=keys.driver.findElement(By.xpath("//input[@name='middleName']"));
		middle.click();
		act.doubleClick(middle).perform();
		Thread.sleep(4000);
		keys.enterData(middle, middle1);
	}

	public void last(String last1) throws InterruptedException
	{
		WebElement last11=keys.driver.findElement(By.xpath("//input[@name='lastName']"));
		last11.click();
		Actions act=new Actions(keys.driver);
		act.doubleClick(last11).perform();
		Thread.sleep(4000);
		keys.enterData(last11, last1);
	}

	public void employeeid(String id1) throws InterruptedException
	{
		WebElement emp=keys.driver.findElement(By.xpath("//label[text()='Employee Id']//following::input[@class='oxd-input oxd-input--active'][1]"));
		emp.click();
		Actions act=new Actions(keys.driver);
		act.doubleClick(emp).perform();
		Thread.sleep(4000);
		keys.enterData(emp, id1);
	}
	
	public void otherid(String id2) throws InterruptedException
	{
		WebElement others=keys.driver.findElement(By.xpath("//label[text()='Other Id']//following::input[@class='oxd-input oxd-input--active'][1]"));
		others.click();
		Actions act=new Actions(keys.driver);
		act.doubleClick(others).perform();
		Thread.sleep(4000);
		keys.enterData(others, id2);
	}
	
	public void driving(String id3) throws InterruptedException
	{
		WebElement drivingLicence=keys.driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
		drivingLicence.click();
		Actions act=new Actions(keys.driver);
		act.doubleClick(drivingLicence).perform();
		Thread.sleep(4000);
		keys.enterData(drivingLicence, id3);
	}
	@FindBy(xpath="//label[text()='License Expiry Date']//following::i[1]")
	WebElement calender1;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[2]")
	WebElement year1;
	@FindBy(xpath="//li[@class='oxd-calendar-selector-month']")
	WebElement months1;
	public void licence(String year,String month,String date) throws InterruptedException
	{
		keys.click(calender1);
		keys.click(year1);
		Thread.sleep(4000);
		WebElement year3=keys.driver.findElement(By.xpath("//li[text()='"+year+"']"));
		year3.click();
		Thread.sleep(4000);
		keys.click(months1);
		WebElement months2=keys.driver.findElement(By.xpath("//li[text()='"+month+"']"));
		months2.click();
		Thread.sleep(4000);
		WebElement date1=keys.driver.findElement(By.xpath("//div[text()='"+date+"']"));
		date1.click();
		
	}
}
