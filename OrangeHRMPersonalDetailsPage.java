package PagePackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRMPersonalDetailsPage
{
	 
	public OrangeHRMPersonalDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement enterUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement enterPassWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnLoginButton;
	
	 @FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")
	 WebElement myInfo;
	 
	 @FindBy(xpath="//a[@href='/web/index.php/pim/viewPersonalDetails/empNumber/7']")
	 WebElement personalSDetails;
	 
	 @FindBy(xpath="//div[@class=\"orangehrm-horizontal-padding orangehrm-vertical-padding\"]/child::h6")
	 WebElement printPersonalDetails;

	GenericKeywordsWithPage map= new GenericKeywordsWithPage("OrangeHRMPersonalDetailsPage");
	 

	public void enterUserName(String userName) 
	{
		
		map.enterData(enterUserName, userName);
		 
	}
	
	public void enterPassWord(String passWord) 
	{
		map.enterData(enterPassWord, passWord);
	}
	public void clickOnLoginButton() 
	{
		map.click(clickOnLoginButton);
	}
	public void clickOnMyInfo()
	{
		map.click(myInfo);
	}
	public void clickOnPersonalDetails()
	{
		map.click(personalSDetails);
	}
	public void getTextOfPersonalLabel() throws Exception 
	{
		map.getText(printPersonalDetails);
	}
}
