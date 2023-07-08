package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import commonUtils.browserSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePageObject;

public class HomePage {

	public static ChromeDriver driver;
	
	@Given("Access the URL {string}")
	public void access_the_url(String url) {
		
		browserSetup bs=new browserSetup();
		driver=bs.chromeSetup();
		driver.get(url);
	}

	@When("Page loads the Maximize the page")
	public void page_loads_the_maximize_the_page() {
		 
		driver.manage().window().maximize();
	}

	@Then("Validate the page title")
	public void validate_the_page_title() {
		
		System.out.println(driver.getTitle());
		//Duplicate Line has been removed and Reviewer Comments Addressed 
	}

	@Then("Validate the product name")
	public void validate_the_product_name() {

		homePageObject hp=new homePageObject(driver);
		String pLogo=hp.productlogo().getText();
		System.out.println(pLogo);
	}

	@When("Verify Whether search bar is visible")
	public void Verify_Whether_search_bar_is_visible() {
		homePageObject hp1=new homePageObject(driver);
		hp1.searchBar().isEnabled();
		System.out.println(hp1.searchBar().isEnabled());
	}
	
	@Then("Validate the Search field placeholder text {string}")
	public void Validate_the_Search_field_placeholder_text(String text)
	{
		homePageObject hp1=new homePageObject(driver);
		String actualText=hp1.placeholderText().getAttribute("placeholder");
		System.out.println(actualText);

		if(actualText.equals(text))
		{
			System.out.println("Test is Passed");
		}
		
	}
	
	@Then("Validate the <Keywords> in search field area")
	public void validate_the_keywords_in_search_field_area(DataTable dataTable) throws InterruptedException {
		homePageObject hp1=new homePageObject(driver);
		
		int count=3;
		int i=0;
		int j=0;
		
		while(j<3)
		{
			hp1.searchBar().sendKeys(dataTable.cell(i, j));
			Thread.sleep(1000);
			hp1.searchBar().clear();
			j++;
		}
	}
	
}
