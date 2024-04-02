package PagePackage1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class NopCommercePage {
	 
		public  NopCommercePage(WebDriver driver)
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
		WebElement customerList;
		
		@FindBy(xpath="//li[@class='nav-item']/child::a[@href='/Admin/Customer/List']")
		WebElement customer;
		
		@FindBy(xpath=" //a[@href='/Admin/Customer/Create']")
		WebElement addNew;
		
		@FindBy(xpath="//input[@name='Email']")
		WebElement enterEmail;
		
		@FindBy(xpath= "//input[@name='Password']")
		WebElement enterPassword;
		
		@FindBy(xpath="//input[@name='FirstName']")
		WebElement enterFirstName;
		
		@FindBy(xpath="//input[@name='LastName']")
		WebElement enetrLastName;
		
		@FindBy(xpath="//input[@ id='Gender_Male']")
		WebElement selectGenderForMale;
		
		@FindBy(xpath="//input[@ id='Gender_Female']")
		WebElement selectGenderForFemale;
		
		@FindBy(xpath="//input[@ id='DateOfBirth']")
		WebElement enterDateOfBirth;
		
		@FindBy(xpath=" //input[@ id='Company']")
		WebElement enterCompanyName;
		
		@FindBy(xpath="//input[@id='IsTaxExempt']")
		WebElement selectIsTaxExempt;
		
		@FindBy(xpath=" //select[@id='SelectedNewsletterSubscriptionStoreIds']")
		WebElement  clickNewsLetters;
		
		@FindBy(xpath="//option[@value='2']/parent::select[@id='SelectedNewsletterSubscriptionStoreIds']")
		WebElement selectNewsLetters;
		
		@FindBy(xpath="//input[@aria-owns='SelectedCustomerRoleIds_taglist SelectedCustomerRoleIds_listbox']")
		WebElement  CustomerRoleIds;
		
		@FindBy(xpath="//select[@id='SelectedCustomerRoleIds']/child::option[@value='4']")
		WebElement SelectedCustomerRoleIds;
		
		@FindBy(xpath="//select[@id='VendorId']")
		WebElement clickVender;
		
		@FindBy(xpath="//select[@id='VendorId']/child::option[@value='1']")
		WebElement selectVender;
		
		@FindBy(xpath="//input[@id='Active']")
		WebElement selectActive;
		
		@FindBy(xpath="//textarea[@id='AdminComment']")
		WebElement enterAdminComment;
		
		@FindBy(xpath="//button[@name='save']")
		WebElement saveTheNewAdmin;
		
		 
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
			test.click(customerList);
		}
		public void selectCustomer() 
		{
			test.click(customer);
		}
		public void clickOnAddNew()
		{
			test.click(addNew);
		}
		public void enterEmail(String Email)
		{
			test.enterData(enterEmail, Email); 
		}
		public void enterPassword(String password)
		{
			test.enterData(enterPassword, password); 
		}
		public void enterFirstName(String firstName)
		{
			test.enterData(enterFirstName, firstName); 
		}
		public void enterLastNmae(String lastname) 
		{
			test.enterData(enetrLastName, lastname);
		}
		public void selectGender()
		{
			test.click(selectGenderForMale);
		}
		public void selectDateOfBirth(String date) 
		{
			test.enterData(enterDateOfBirth, date);
			
		}
		public void enterCompanyName(String companyName) 
		{
			test.enterData(enterCompanyName, companyName);
		}
		public void selectIsTaxExempt() 
		{
			test.click(selectIsTaxExempt);
		}
		public void enterNewsLetters( )
		{
			test.click(clickNewsLetters);
		}
		public void selectNewsLetters() 
		{
			test.click(selectNewsLetters);
		}
		
		public void CustomerRoleIds() 
		{
			test.click(CustomerRoleIds);
		}
		public void SelectedCustomerRoleIds()
		{
			test.click(SelectedCustomerRoleIds);
		}
		public void clickVender()
		{
			test.click(clickVender);
		}
		public void selectVender() 
		{
			test.click(selectVender);
		}
		public void selectActive() 
		{
			test.click(selectActive);
		}
		public void enterAdminComment(String enterSomeComment) 
		{
			test.enterData(enterAdminComment, enterSomeComment);
		}
		public void saveTheNewAdmin() 
		{
			test.click(saveTheNewAdmin);
		}
		 public void gettitle() throws Exception
		 {
			 test.getText(CustomerRoleIds);
		 }
	}





