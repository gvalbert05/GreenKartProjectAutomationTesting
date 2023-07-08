package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageObject {
	 
	ChromeDriver driver;

	public homePageObject(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='brand greenLogo']")
	WebElement productlogo;
	
	public WebElement productlogo()
	{
		return productlogo;
	}
	
	@FindBy(xpath="//input[@class='search-keyword']")
	WebElement searchBar;
	
	public WebElement searchBar()
	{
		return searchBar;
	}
	
	@FindBy(xpath="//input[@placeholder='Search for Vegetables and Fruits']")
	WebElement placeholderText;
	
	public WebElement placeholderText()
	{
		return placeholderText;
	}
}
