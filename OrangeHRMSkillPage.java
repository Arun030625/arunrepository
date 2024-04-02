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

public class OrangeHRMSkillPage 
{ 

 

	 
	public OrangeHRMSkillPage(WebDriver driver)
	{
		PageFactory.initElements( driver,  this);
	}

	@FindBy(xpath="//input[@name='username']")
	WebElement enterUserName;

	@FindBy(xpath="//input[@name='password']")
	WebElement enterPassWord;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnLoginButton;

	@FindBy(xpath="//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement clickOnAdmin;
	
	@FindBy(xpath="//span[contains (text(), 'Qualific')]")
	WebElement clickOnQualification;
	
	@FindBy(xpath="//a[contains (text(),'Skil')]")
	WebElement clickOnSkill;

	@FindBy(xpath=" //button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement clickOnAdd;
	
	@FindBy(xpath=" //div[@class='']/child:: input[@class=\"oxd-input oxd-input--active\"]")
	WebElement enterName;
	
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	WebElement enterDescription;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnSave;
	  
	@FindBy(xpath="//div[contains (text(),'')]/parent::div/following-sibling::div[2]/div/button[2]")
	WebElement clickOnEdit;
	 
	 
	
	@FindBy(xpath="//div[@class='']/child::textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")
	WebElement enterDifferentDescription;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement clickONSaveAgain;


	GenericKeywordsWithPage map=new GenericKeywordsWithPage("OrangeHRMSkillPage");
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
	public void clickOnAdmin() 
	{
		map.click(clickOnAdmin);
	}
	public void enterName(String name) 
	{
		map.enterData(enterName, name);;
	}
	
	public void clickOnQualification() 
	{
		map.click(clickOnQualification);
	}
	public void clickOnSkill()
	{
		map.click(clickOnSkill);
	}
	public void clickOnAdd(  ) 
	{
		map.click(clickOnAdd);
	}
	public void name(String description)
	{
		map.enterData(enterDescription, description);
	}
	public void clickOnSave() 
	{
		map.click(clickOnSave);
	}
	public void clickOnEdit() 
	{
		map.click(clickOnEdit);
		
	}
	public void enterDifferentDescription(String description) 
	{
		map.enterData(enterDifferentDescription, description);
	}
	public void clickONSaveAgain() 
	{
		map.click(clickONSaveAgain);
	}
	public void enterDescription(String description1) 
	{
		map.enterData(enterDescription, description1);
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
