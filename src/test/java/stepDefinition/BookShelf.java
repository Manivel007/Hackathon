package stepDefinition;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObject.GiftCard;
import PageObject.LivingHomePage;
import PageObject.SearchItems;
import Utilities.excel_Utility;
import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class BookShelf extends BaseClass {
	public WebDriver driver = getDriver();
	
	Logger logger=BaseClass.getLogger();
	public LivingHomePage homepage = new LivingHomePage(driver);
	public  SearchItems search_result = new SearchItems(driver);;
	GiftCard  gift_carrd;
	//public WebDriver driver;
	public excel_Utility excel= new excel_Utility(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities\\Input.xlsx");


	@Given("search for bookselves")
	public void search_for_bookselves_under() throws FileNotFoundException, IOException {
	 
	    homepage= new LivingHomePage(driver);
		homepage.searchbox();
		String input=excel.getCellData("Sheet1",0,1);
		homepage.searchbox().sendKeys(input);
		homepage.clicksearchbtn();
		search_result = new SearchItems(driver);
		
		search_result.close_popup();
	    
	    
	}
	
	@When("select kids category")
	public void select_kids_category() throws InterruptedException {
		
		search_result.category_hover(); 
		search_result.kids_filters();
	 
	}
	
	@And("select in stock")
	public void select_in_stock() throws InterruptedException {
	  
		search_result.instock_filters();
	}
	
	@And("priority high to low")
	public void priority_low_to_high() {
	
		search_result.sort();
	}
	
	@Then("Print the first three bookshelves")
	public void print_the_first_three_bookshelves_under() throws IOException {
	 
		List<WebElement> Details = search_result.check_print_results();
		int r=1;
		for(int i=0;i<3;i++) {
			String detail = Details.get(i).getText();
			Assert.assertTrue(detail.contains(excel.getCellData("Sheet1",1,1)));
			excel.setCellData("Sheet2", r ,0, detail);
			r++;
			System.out.println(detail);
			
			
		}
	}
	}
	
//	@When("the user enters the invalid input as search {string}")
//	public void the_user_enters_the_invalid_input_as_search(String string) {
//	}
//
//	@When("the user enters the input as search {string}")
//	public void the_user_enters_the_input_as_search(String string) {
//	}
//
//	
//
//	@When("user set the catogory")
//	public void user_set_the_catogory() {
//	}
//
//	@When("user set price in dropdown")
//	public void user_set_price_in_dropdown() {
//	}
//
//	@Then("user get the first three items name and price in console")
//	public void user_get_the_first_three_items_name_and_price_in_console() {
//	}
//
//	@Given("user close the authentication popup")
//	public void user_close_the_authentication_popup() {
//	}
//
//	@Given("user set the catogory")
//	public void user_set_the_catogory() {
//
//	}
//
//	@Given("user set price in dropdown")
//	public void user_set_price_in_dropdown() {
//
//	}
//}









