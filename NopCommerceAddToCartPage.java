package PagePackage1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class NopCommerceAddToCartPage {

	public  NopCommerceAddToCartPage(WebDriver driver)
	{
		PageFactory.initElements( driver,  this);
		//current class Non static variable will be called by cons




	}

	@FindBy(xpath="//a[@href='/computers']")
	WebElement computers;


	@FindBy(xpath="//ul[@class=\"top-menu notmobile\"]//a[text()='Desktops ']")
	WebElement  desktops;	

	@FindBy(xpath="//label[@for='FirstName']/following-sibling::input")
	WebElement  firstName;

	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastName;

	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement selectDate;

	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement selectMonth;

	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement selectYear;

	@FindBy(xpath= "//input[@name='Email']")
	WebElement email;

	@FindBy(xpath="//input[@name='Company']")
	WebElement company;

	@FindBy(xpath="//input[@name='Password']")
	WebElement password;

	@FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement confirmPassword;

	@FindBy(xpath="//input[@ id='Gender_Female']")
	WebElement selectGenderForFemale;

	@FindBy(xpath="//button[@name='register-button']")
	WebElement registerButton;




	GenericKeywordsWithPage test=new GenericKeywordsWithPage("NopCommerceRegisterPage");
	/*	public void clearBeforeUserNameData() 
		{
			test.
		}*/

	public void clickOnRegister()
	{
		test.click(register);
	}
	public void selectGender() throws InterruptedException
	{
		test.click(gender);
		Thread.sleep(3000);
	}
	public void enterFirstName(String fName) throws InterruptedException
	{
		test.enterData(firstName, fName);
		Thread.sleep(3000);
	}
	public void enterLastName(String lName) throws InterruptedException 
	{
		test.enterData(lastName, lName);
		Thread.sleep(3000);
	}
	public void date(int birthDate) throws InterruptedException
	{
		test.click(selectDate);
		Thread.sleep(3000);
		test.SelectDropDownByIndex(selectDate, birthDate);
		Thread.sleep(3000);
	}
	public void month(int birthMonth) throws InterruptedException
	{
		test.click(selectMonth);
		Thread.sleep(3000);
		test.SelectDropDownByIndex(selectMonth, birthMonth);
		Thread.sleep(3000);
	}
	public void year(String birthyear) throws InterruptedException
	{
		test.click(selectYear);
		Thread.sleep(3000);
		test.SelectDropDown(selectYear, birthyear);
		Thread.sleep(3000);
	}
	public void enterEmail(String eMail) throws InterruptedException 
	{
		test.enterData(email, eMail);
		Thread.sleep(3000);
	}
	public void enterCompany(String companyName) throws InterruptedException 
	{
		test.enterData(company, companyName);
		Thread.sleep(3000);
	}
	public void enterPassword(String pword) throws InterruptedException
	{
		test.enterData(password, pword);
		Thread.sleep(3000);
	}
	public void enterCNFPassword(String cnfPassword) throws InterruptedException 
	{
		test.enterData(confirmPassword, cnfPassword);
		Thread.sleep(3000);
	}
	public void finalRegister() throws InterruptedException 
	{
		test.click(registerButton);
		Thread.sleep(3000);
	}
}





