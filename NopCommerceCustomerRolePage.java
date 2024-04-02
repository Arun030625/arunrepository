package PagePackage1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class NopCommerceCustomerRolePage {
	 
		public  NopCommerceCustomerRolePage(WebDriver driver)
		{
			PageFactory.initElements( driver,  this);
			//current class Non static variable will be called by cons


		
		 
		}
		 
		@FindBy(xpath="//input[@value='admin@yourstore.com']")
		WebElement userName;


		@FindBy(xpath="//input[@id='Password']")
		WebElement  passWord;	

		@FindBy(xpath="//button[@class=\"button-1 login-button\"]")
		WebElement  loginbutton;
		
		@FindBy(xpath="//i[@class='nav-icon far fa-user']/parent::a[@class='nav-link']")
		WebElement clickOnCustomerList;
		
		@FindBy(xpath="//a[@href='/Admin/CustomerRole/List']")
		WebElement clickOnCustomerRoles;
		
		 @FindBy(xpath="//a[@href='/Admin/CustomerRole/Create']")
		 WebElement clickOnAddNew;
		 
		 @FindBy(xpath="//input[@name='Name']")
		 WebElement enterNameForInputBox;
		
		 @FindBy(xpath="//input[@id='FreeShipping']")
		 WebElement clickOnFreeShipping;
		 
		 @FindBy(xpath="//input[@ id='TaxExempt'] ")
		 WebElement clickOnTaxExemption;
		 
		 
		 @FindBy(xpath="//input[@id='OverrideTaxDisplayType']")
		 WebElement clickOnOverrideTaxDisplayType;
		 
		 @FindBy(xpath="//select[@id='DefaultTaxDisplayTypeId']")
		 WebElement clickDefaultTaxDisplayTypeId;
		 
		 @FindBy (xpath=("//option[@value='0']"))
		 WebElement selectTaxInclude;
		 
		 @FindBy(xpath="//input[@id='EnablePasswordLifetime']")
		 WebElement clickOnEnablePasswordLifetime;
		 
		 @FindBy(xpath="//input[@id='SystemName']")
		 WebElement enterSystemName;
		 
		 @FindBy(xpath="//button[@name='save']")
		 WebElement clickOnsave;
		 
		 
		GenericKeywordsWithPage test=new GenericKeywordsWithPage("NopCommercePage");
	/*	public void clearBeforeUserNameData() 
		{
			test.
		}*/

		public void nopCommersUserName(String enteruser)
		{
			test.clearEnter(userName, enteruser);
		}
		public void nopCommerUserPassword(String enterpassword)
		{
			test.clearEnter(passWord, enterpassword);
		}

		public void  nopCommerloginButton()
		{
			test.click(loginbutton);
		}
		
		public void clickOnCustomeroption()
		{
			test.click(clickOnCustomerList);
		}
		public void selectCustomer() 
		{
			test.click(clickOnCustomerRoles);
		}
		
		public void clickOnAddNew()
		{
			test.click(clickOnAddNew);
		}
		 public void enterName(String name) 
		 {
			test.enterData(enterNameForInputBox, name);
		}
		 public void clickOnFreeShipping() 
		 {
			test.click(clickOnFreeShipping);
		}
		public void clickOnTaxExemption()
		{
			test.click(clickOnTaxExemption);
		}
		public void clickDefaultTaxDisplayTypeId() 
		{
			test.click(clickDefaultTaxDisplayTypeId);
		}
		public void selectTaxInclude() 
		{
			test.click(selectTaxInclude);
		}
		
		public void clickOnOverrideTaxDisplayType() 
		{
			test.click(clickOnOverrideTaxDisplayType);
		}
		
		public void clickOnEnablePasswordLifetime()
		{
			test.click(clickOnEnablePasswordLifetime);
		}
		public void enterSystemName(String systemName) 
		{
			test.enterData(enterSystemName, systemName);
		}
		public void clickOnsave() 
		{
			test.click(clickOnsave);
		}
	}





