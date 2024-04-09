package stepDefinition;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.LivingHomePage;
import PageObject.SearchItems;
import Utilities.excel_Utility;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LivingSubMenu {
	
public WebDriver driver = BaseClass.getDriver();
	
	Logger logger=BaseClass.getLogger();
	public LivingHomePage homepage = new LivingHomePage(driver);
	public  SearchItems search_result = new SearchItems(driver);
	public excel_Utility excel= new excel_Utility(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities\\Input.xlsx");
	@Given("Hover mouse to living")
	public void hover_mouse_to_living() throws InterruptedException {
	
		 homepage.Hover();
	}

	@When("sub menus should be appeared and print it")
	public void sub_menus_should_be_appeared_and_print_it() throws IOException {
	 
		
		List<WebElement> submenu = homepage.Living_Options();
		 int menu_count=0;
		 for(int i=0;i<submenu.size();i++) {
		 String sub_menu = submenu.get(i).getText();
		 excel.setCellData("Sheet3", menu_count, 0 ,sub_menu);
		 menu_count++;
		 
		 }
	}
}

