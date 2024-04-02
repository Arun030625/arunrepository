package PagePackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRMImageUploadpage 
{
	public OrangeHRMImageUploadpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement enterUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement enterPassWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnLoginButton;
	

	@FindBy(xpath="//span[text()='My Info']")
	WebElement myinfo;
	
	@FindBy(xpath="//img[@class='employee-image']")
	WebElement image;
	
	@FindBy(xpath="//div[@class='employee-image-wrapper']/following-sibling::button")
	WebElement addImage;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnSave;
	
	
	  GenericKeywordsWithPage map=new GenericKeywordsWithPage("OrangeHRMImageUploadpage");
	  
	  
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
		public void clickOnmyinfo()
		{
			map.click(myinfo);
		}
		public void clickOnImage()
		{
			map.click(image);
		}
		public void clickOnAddImage() 
		{
			map.click(addImage);
		}
		public void upLoad() throws InterruptedException 
		{
			addImage.sendKeys("C:\\\\Users\\\\arun1\\\\OneDrive\\\\Pictures\\\\Screenshots\\\\Screenshot 2023-10-05 192935.png");
			Thread.sleep(10000);
		}
		 
		public void clickOnSave() 
		{
			map.click(clickOnSave);
		}
}
