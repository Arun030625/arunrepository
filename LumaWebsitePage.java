package PagePackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class LumaWebsitePage
{
	public  LumaWebsitePage(WebDriver driver)
	{
		PageFactory.initElements( driver,  this);
		//current class Non static variable will be called by cons


	}
	@FindBy(xpath="//ul[@class='level0 submenu ui-menu ui-widget ui-widget-content ui-corner-all']/preceding-sibling::a[@id='ui-id-4']")
	WebElement MoouseOverOnWoman;

	@FindBy(xpath=" //span[contains(text(),'To')]/parent::a[@id='ui-id-9']")
	WebElement MoouseOverOnTops;

	@FindBy(xpath=" //span[contains(text(),'Te')]/parent::a[@id='ui-id-13']")
	WebElement MoouseOverOnTees;

	@FindBy(xpath="//a[contains (text(),'Desiree F')]")
	WebElement clickOnProduct;

	@FindBy(xpath=" //div[@class=\"swatch-opt-1588\"]/child::div[1]/div/div[5]")
	WebElement selectSizeBeforePage;

	@FindBy(xpath="//div[@aria-label='XL']")
	WebElement selectSize;

	@FindBy(xpath="//div[@class='swatch-opt-1588']/div[2]/div/div[3]")
	WebElement selectColourBeforePage;

	@FindBy(xpath="//div[@aria-label='Yellow']")
	WebElement selectColour;

	@FindBy(xpath="//button[@title='Add to Cart']")
	WebElement clickOnAddToCart;

	@FindBy(xpath="//div[contains(text(),'You added Desiree Fitnes')]")
	WebElement printTheSuccesMessage;

	@FindBy(xpath="//span[@id='product-price-1588']")
	WebElement priceBeforePage;

	@FindBy(xpath="//span[@id='product-price-1588']/child::span")
	WebElement priceAfterPage;


	GenericKeywordsWithPage luma=new GenericKeywordsWithPage("LumaWebsitePage");
	/*	public void clearBeforeUserNameData() 
			{
				test.
			}*/

	public void MoouseOverOnWoman() throws Exception 
	{
		luma.mouseOverOnElement(MoouseOverOnWoman);
		Thread.sleep(5000);
	}		
	public void MoouseOverOnTops() throws Exception
	{
		luma.mouseOverOnElement(MoouseOverOnTops);
		 
	}
	public void MoouseOverOnTees() throws Exception 
	{
		luma.click(MoouseOverOnTees);
	}
	public void clickOnProduct()
	{
		luma.click(clickOnProduct);
	}
	public void selectSizeBeforePage() throws Exception 
	{
		luma.getText(selectSizeBeforePage);
	}
	public void selectSize() 
	{
		luma.click(selectSize);	
	}
	public void selectColour() 
	{
		luma.click(selectColour);
	}
	public void clickOnAddToCart() 
	{
		luma.click(clickOnAddToCart);
	}
	public void printTheSuccesMessage() throws Exception 
	{
		System.out.println(luma.getText(printTheSuccesMessage));
	}
	
}

