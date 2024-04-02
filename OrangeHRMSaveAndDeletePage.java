package PagePackage1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRMSaveAndDeletePage 
{

	public  OrangeHRMSaveAndDeletePage(WebDriver driver)
	{
		PageFactory.initElements( driver,  this);
		//current class Non static variable will be called by cons

	}

	@FindBy(xpath="//input[@name='username']")
	WebElement enterUserName;

	@FindBy(xpath="//input[@name='password']")
	WebElement enterPassWord;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnLoginButton;

	@FindBy(xpath="//a[@href='/web/index.php/pim/viewPimModule']")
	WebElement  clickOnPim;

	@FindBy(xpath=" //button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement clickOnAdd;

	@FindBy(xpath="//input[@name='firstName']")
	WebElement enterFirstName;

	@FindBy(xpath="//input[@name='middleName']")
	WebElement enterMiddleName;

	@FindBy(xpath="//input[@name='lastName']")
	WebElement enterLastNmae;

	@FindBy(xpath="//div[@class='']/child::input[@class='oxd-input oxd-input--active']")
	WebElement enterEmployeeId;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnSave;

	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-item']/parent::li[@class='oxd-topbar-body-nav-tab --visited']")
	WebElement clickOnEmpolyeeList;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
	WebElement enterEmployeeName;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnSearchButton;

	@FindBy(xpath="//i[@class='oxd-icon bi-trash']")
	WebElement clickOnDeleteButton;

	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement clickOnFinalDeleteButton;

	
	GenericKeywordsWithPage map=new GenericKeywordsWithPage("OrangeHRMSaveAndDeletePage");
	/*	public void clearBeforeUserNameData() 
		{
			test.
		}*/
	
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
	public void clickOnPim() 
	{
		map.click(clickOnPim);
	}
	public void clickOnAdd() 
	{
		map.click(clickOnAdd);
	}
	public void enterFirstName(String firstName) 
	{
		map.enterData(enterFirstName, firstName);
	}
	public void enterMiddleName(String middleName) 
	{
		map.enterData(enterMiddleName, middleName);
	}
	public void enterLastNmae(String lastName)
	{
		map.enterData(enterLastNmae, lastName);
	}
	public void enterEmployeeId(String employeeId) throws InterruptedException 
	{
		 Thread.sleep(5000);
		map.enterData(enterEmployeeId, employeeId);
	}
	public void clickOnSave() throws InterruptedException 
	{
		 Thread.sleep(3000);
  		map.click(clickOnSave);
  		 
	}
	public void clickOnEmpolyeeList() throws InterruptedException 
	{
		 Thread.sleep(5000);
		map.click(clickOnEmpolyeeList);
		 
	}
	public void enterEmployeeName(String employeeName) throws InterruptedException
	{
		 Thread.sleep(3000);
		map.enterData(enterEmployeeName, employeeName);
	}
	public void clickOnSearchButton() throws InterruptedException
	{
		 Thread.sleep(3000);
		map.click(clickOnSearchButton);
	}
	public void clickOnDeleteButton() throws InterruptedException
	{
		Thread.sleep(2000);
		map.click(clickOnDeleteButton);
	}
	public void clickOnFinalDeleteButton() throws InterruptedException
	{
		Thread.sleep(2000);
		map.click(clickOnFinalDeleteButton);
	}
	
	@DataProvider (name="getData")
	 public static String[][] getData() throws IOException
	{
       File excelFile = new File("C:\\Users\\arun1\\workspace\\FrameWorkDemos\\ExcelFile\\Book1.xlsx");
       FileInputStream fis = new FileInputStream(excelFile);
       XSSFWorkbook workBook = new XSSFWorkbook(fis);
       XSSFSheet sheet = workBook.getSheet("sheet1");
       int noOfRows = sheet.getPhysicalNumberOfRows();
       int noOfColumns = sheet.getRow(0).getLastCellNum();

       String[][] data = new String[noOfRows - 1][noOfColumns];

       for (int i = 0; i < noOfRows - 1; i++) {
           for (int j = 0; j < noOfColumns; j++) {
               DataFormatter formatter = new DataFormatter();
               data[i][j] = formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
           }
       }
		return data;
	}

}
