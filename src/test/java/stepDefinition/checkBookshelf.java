package stepDefinition;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObject.GiftCard;
import PageObject.LivingHomePage;
import PageObject.SearchItems;
import Utilities.excel_Utility;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkBookshelf extends BaseClass {
	public WebDriver driver = getDriver();
	
	Logger logger=BaseClass.getLogger();
	public LivingHomePage homepage = new LivingHomePage(driver);
	public  SearchItems search_result = new SearchItems(driver);;
	GiftCard  gift_carrd;
	//public WebDriver driver;
	public excel_Utility excel= new excel_Utility(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities\\Input.xlsx");

	@Given("the user is in Bookshelves page")
	public void the_user_is_in_bookshelves_page() {

		homepage= new LivingHomePage(driver);
		homepage.searchbox();
	}

	@When("the user enters the invalid input as search {string}")
	public void the_user_enters_the_invalid_input_as_search(String string) {
		homepage.searchbox().sendKeys("Bwqdvnjibvoiqbvb1232");
		homepage.clicksearchbtn();
	}

	@When("the user enters the input as search {string}")
	public void the_user_enters_the_input_as_search(String string) {
		homepage.searchbox().sendKeys(string);
		homepage.clicksearchbtn();
	}

	@When("user close the authentication popup")
	public void user_close_the_authentication_popup() {
		search_result.close_popup();
	}

	@When("user set the catogory")
	public void user_set_the_catogory() throws InterruptedException {
		search_result.category_hover();
		search_result.kids_filters();
	}

	@When("user set price in dropdown")
	public void user_set_price_in_dropdown() {
		search_result.sort();
	}

	@Then("user get the first three items name and price in console")
	public void user_get_the_first_three_items_name_and_price_in_console() throws IOException {
		List<WebElement> Details = search_result.check_print_results();
//		int r=1;
		for(int i=0;i<3;i++) {
			String detail = Details.get(i).getText();
//			Assert.assertTrue(detail.contains(excel.getCellData("Sheet1",1,1)));
//			excel.setCellData("Sheet2", r ,0, detail);
//			r++;
			System.out.println(detail);
	}
	}
}

