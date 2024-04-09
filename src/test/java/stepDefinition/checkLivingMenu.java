package stepDefinition;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import PageObject.LivingHomePage;
import PageObject.SearchItems;
import Utilities.excel_Utility;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class checkLivingMenu {
public WebDriver driver = BaseClass.getDriver();
	
	Logger logger=BaseClass.getLogger();
	public LivingHomePage homepage = new LivingHomePage(driver);
	public  SearchItems search_result = new SearchItems(driver);
	public excel_Utility excel= new excel_Utility(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities\\Input.xlsx");


	@Given("the user scrolls up to Header")
	public void the_user_scrolls_up_to_header() throws InterruptedException {
		homepage.clicksearchbtn();
	}
	
@Then("the user clicks on Living storage")
 public void the_user_clicks_on_living_storage() throws InterruptedException {
	 BaseClass.getLogger().info("User clicks on living storage header.. ");
	homepage.Hover();
 }

 @Then("the user extracts all items under living storage")
  public void the_user_extracts_all_items_under_living_storage() {
	 BaseClass.getLogger().info("User extracts all items under living storage.. ");
	  homepage.Living_Options();
	
		}
 @Then("the user clicks on table section")
 public void the_user_clicks_on_table_section() {
	 homepage.searchbox();
 }
// @And("click each and every headers are navigating")
// public void click_each_and_every_headers_are_navigating() {
////	 homepage.Living_Options();
//	 WebElement sub_menu = new Living_Options();
//	sub_menu.click();
//	List<WebElement> sub_menu =(Options_Living);
////	sub_menu.click();
// }
}
