package PagePackage1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.types.Commandline.Argument;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.surveillance.utilitiy.ApplicationKeywords;
import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class FlipkartAddToCardPage
{
	
	
	public FlipkartAddToCardPage(WebDriver driver)
	{
		PageFactory.initElements( driver,  this);
	}

	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")
	WebElement searchInputBox;

	@FindBy(xpath="//button[@aria-label='Search for Products, Brands and More']")
	WebElement clickOnSearch;

	@FindBy(xpath="//div[@class='CXW8mj']/child::img[@src='https://rukminim2.flixcart.com/image/312/312/xif0q/computer/t/h/j/-original-imagwyp2uee8zxez.jpeg?q=70']")
	WebElement clickOnProduct;

	@FindBy(xpath="//span[contains (text(),'Acer Aspire 3 Intel Core i3 12th Gen 1215U - (8 GB/512 GB SSD/Windows 11 Home) A315-59 Thin and Light Laptop')]" )
	WebElement checkTheProduct;

	@FindBy(xpath="//li[@class='col col-6-12']/child::button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement clickOnAddToCart;

	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']/child::span")
	WebElement clickOnPlaceOrder;

	@FindBy(xpath="//input[@class=\"_2IX_2- _17N0em\"]")
	WebElement enterMobileNumber;

	@FindBy(xpath="//button[@class=\"_2KpZ6l _20xBvF _3AWRsL\"]")
	WebElement clickOnContinue;


	@FindBy(xpath="//div[@class='_1P2-0f']")
	WebElement clickOnAddNewAddrres;

	@FindBy(xpath="//input[@name='name']")
	WebElement enterNameForAddres;

	@FindBy(xpath="//input[@name='phone']")
	WebElement enterMobNumForAddres;

	@FindBy(xpath="//input[@name='pincode']")
	WebElement enterPincodeForAddres;

	@FindBy(xpath="//input[@name='addressLine2']")
	WebElement enterLocalityForAddres;

	@FindBy(xpath="//textarea[@name='addressLine1']")
	WebElement enterBreifAddres;

	@FindBy(xpath="//input[@name='city']")
	WebElement enterCityForAddres;

	@FindBy(xpath="//select[@name='state']")
	WebElement clickOnSelectState;

	@FindBy(xpath="//option[@value='Andhra Pradesh']")
	WebElement selectState;

	@FindBy(xpath="//input[@name='landmark']")
	WebElement enterLandmarkForAddres;

	@FindBy(xpath="//input[@name='alternatePhone']")
	WebElement enterAltMobNumForAddres;

	@FindBy(xpath="//input[@id='HOME']")
	WebElement clickOnHomeDelivery;

	@FindBy(xpath="//button[@class='_2KpZ6l _1JDhFS _3AWRsL']")
	WebElement clickOnSaveAndContinue;

	@FindBy(xpath="//span[contains (text(),'Order Summary')]")
	WebElement verifyTheSummery;

	@FindBy(xpath=" //button[@class='_2KpZ6l _1seccl _3AWRsL']")
	WebElement clickOnContinueForSummery;

	@FindBy(xpath="//button[@class='_2KpZ6l _1uR9yB _3dESVI']")
	WebElement clickOnAcceptAndContinue;

	@FindBy(xpath="//input[@id='COD']")
	WebElement clickOnCOD;

	GenericKeywordsWithPage map=new GenericKeywordsWithPage("FlipkartAddToCardPage");
	/*	public void clearBeforeUserNameData() 
		{
			test.
		}*/
	

	public void searchInputBox(String search) 
	{
		 map.enterData(searchInputBox, search);
		 
	}
	public void clickOnSearch() 
	{
		map.click(clickOnSearch);
	}
	public void clickOnProduct()
	{
		      map.click(clickOnProduct);
	}
	public void checkTheProduct(String product) throws Exception 
	{
		map.verify(checkTheProduct, product);
	}
	public void windowHandle() throws InterruptedException 
	{   Set<String> windowHandles =map.driver.getWindowHandles();

    // Switch to the new tab
    for (String windowHandle : windowHandles) {
        if (!windowHandle.equals(map.driver.getWindowHandle())) {
            map.driver.switchTo().window(windowHandle);
            break;
        }
    }

		Thread.sleep(5000);
	}
	public void scrollDown() 
	{
		map.scrollDown();
	}
	 
	public void clickOnPlaceOrder()
	{
		map.click(clickOnPlaceOrder);
	}
	public void enterMobileNumber(String mobileNumber)
	{
		map.enterData(enterMobileNumber, mobileNumber);
	}
		public void clickOnContinue() 
	{
		map.click(clickOnContinue);
	}
		public void clickOnAddNewAddrres() 
		{
			map.click(clickOnAddNewAddrres);
		}
		public void enterNameForAddres(String name) 
		{
			map.enterData(enterNameForAddres, name);
		}
		public void enterMobNumForAddres(String mobNum) 
		{
			map.enterData(enterMobNumForAddres, mobNum);
		}
		public void enterPincodeForAddres(String pincode) 
		{
			map.enterData(enterPincodeForAddres, pincode);
		}
		public void enterLocalityForAddres(String locality)
		{
			map.enterData(enterLocalityForAddres, locality);
		}
		public void enterBreifAddres(String address)
		{
			map.enterData(enterBreifAddres, address);
		}
		public void enterCityForAddres(String city) 
		{
			map.clearEnter(enterCityForAddres, city);
		}
		public void clickOnSelectState() 
		{
			map.click(clickOnSelectState);
		}
		public void selectState() 
		{
			map.click(selectState);
		}
		public void enterLandmarkForAddres(String landmark) 
		{
			map.enterData(enterLandmarkForAddres, landmark);
		}
		public void enterAltMobNumForAddres(String AlterMobileNumber) 
		{
			map.enterData(enterAltMobNumForAddres, AlterMobileNumber);
		}
		public void clickOnHomeDelivery()
		{
			map.click(clickOnHomeDelivery);
		}
		public void clickOnSaveAndContinue() 
		{
			map.click(clickOnSaveAndContinue);
		}
		public void verifyTheSummery(String summery) throws Exception
		{
			map.verify(verifyTheSummery, summery);
		}
		public void clickOnAcceptAndContinue() 
		{
			map.click(clickOnAcceptAndContinue);
		}
		public void clickOnCOD() 
		{
			map.click(clickOnCOD);
		}
		 
		@DataProvider (name="getData")
		 public static String[][] getData() throws IOException
		{
	       File excelFile = new File("C:\\Users\\arun1\\OneDrive\\Documents\\Book2.xlsx");
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
