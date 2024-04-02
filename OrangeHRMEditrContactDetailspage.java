package PagePackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRMEditrContactDetailspage 
{
	public OrangeHRMEditrContactDetailspage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement user;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")
	WebElement myInfo;
		
	@FindBy(xpath="//a[text()='Contact Details']")
	WebElement contactDetails;
	
	@FindBy(xpath="//label[text()='Street 1']/parent::div/following-sibling::div/input")
	WebElement address1;
	
	@FindBy(xpath="//label[text()='Street 2']/parent::div/following-sibling::div/input") 
	WebElement address2;
	
	@FindBy(xpath="//label[text()='City']/parent::div/following-sibling::div/input")
	WebElement city;
	
	@FindBy(xpath="//label[text()='State/Province']/parent::div/following-sibling::div/input")
	WebElement state;
	
	@FindBy(xpath="//label[text()='Zip/Postal Code']/parent::div/following-sibling::div/input")
	WebElement zipCode;
	
	@FindBy(xpath="//label[text()='Country']//following::i[1]")
	WebElement country;
	
	@FindBy(xpath="//label[text()='Home']/parent::div/following-sibling::div/input")
	WebElement homeNumber;
	
	@FindBy(xpath="//label[text()='Mobile']/parent::div/following-sibling::div/input")
	WebElement mobileNumber;
	
	@FindBy(xpath="//label[text()='Work']/parent::div/following-sibling::div/input")
	WebElement work;
	
	@FindBy(xpath="//label[text()='Work Email']/parent::div/following-sibling::div/input")
	WebElement workEmail;
	
	@FindBy(xpath="//label[text()='Other Email']/parent::div/following-sibling::div/input")
	WebElement otherEmail;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	GenericKeywordsWithPage map= new GenericKeywordsWithPage("OrangeHRMEditrContactDetailspage");
	
	public void enterUsername(String username) throws InterruptedException 
	{
		map.enterData(user, username);
		 
	}
	public void enterPassword(String pass) 
	{
		map.enterData(password, pass);
	}
	 
	public void clickOnLogin() 
	{
		map.click(loginButton);
	}
	public void clickOnMyInfo()
	{
		map.click(myInfo);
		
	}
	public void clickOnContactDetails()
	{
		map.click(contactDetails);
	}
	public void  enterAddress1(String address ) throws InterruptedException
	{
		map.enterData(address1, address);
		Thread.sleep(3000);
	}
	public void  enterAddress2(String address ) throws InterruptedException
	{
		map.enterData(address2, address);
		Thread.sleep(3000);
	}
	public void enterCity(String cityName) throws InterruptedException
	{
		map.enterData(city, cityName);
		Thread.sleep(3000);
	}
	public void enterState(String stateName) throws InterruptedException
	{
		map.enterData(state, stateName);
		Thread.sleep(3000);
	}
	public void enterCountry(String countryName) throws InterruptedException
	{
		map.click(country);
		Thread.sleep(5000);
		 
		
		}
	public void enterPincode(String pin)
	{
		map.enterData(zipCode, pin);
	}
	public void enterMobileNumber(String home)
	{
		map.enterData(homeNumber, home);
	}
	public void enterWorkNumber(String number)
	{
		map.enterData(mobileNumber, number);
	}
	public void enterWork(String workName)
	{
		map.enterData(work, workName);
	}
	public void enterEmail(String mail) throws InterruptedException 
	{
		WebElement emp=map.driver.findElement(By.xpath("//label[text()='Work Email']/parent::div/following-sibling::div/input"));
		emp.click();
		Actions act=new Actions(map.driver);
		act.keyDown( Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		map.enterData(emp, mail);
	}
	public void enterOtherEmail(String Email) throws InterruptedException
	{
		WebElement emp=map.driver.findElement(By.xpath("//label[text()='Other Email']/parent::div/following-sibling::div/input"));
		emp.click();
		Actions act=new Actions(map.driver);
		act.keyDown( Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(4000);
		map.enterData(emp, Email);
	}
	public void clickOnSave() throws InterruptedException
	{
		Thread.sleep(10000);
		map.click(save);
	}
}
