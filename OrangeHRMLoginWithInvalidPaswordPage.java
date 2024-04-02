 package PagePackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRMLoginWithInvalidPaswordPage 

{
	public OrangeHRMLoginWithInvalidPaswordPage(WebDriver driver)
	{
	 PageFactory.initElements( driver,  this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement enterUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement enterPassWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnLoginButton;
	
	@FindBy(xpath="//p[@class= 'oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement textResult;
	 
	
	 
	GenericKeywordsWithPage map= new GenericKeywordsWithPage("OrangeHRMLoginWithInvalidPaswordPage");
	

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
	 public void result() throws Exception 
	 {
		map.getText(textResult);
	}
	 
	

}
