package stepDefinition;

import org.openqa.selenium.WebDriver;

import PageObject.GiftCard;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class checkGiftcard {
	
	WebDriver driver = BaseClass.getDriver();
	public GiftCard giftCard = new GiftCard(driver);

	@Given("the user successfully navigating to the Giftcard page")
	public void the_user_successfully_navigating_to_the_giftcard_page() throws InterruptedException {
		giftCard.homeButtonGiftCard_click();
		
	}
	
	
	@Then("the user selects Birthday\\/Aniversary occasion")
	public void the_user_selects_birthday_aniversary_occasion() {
		giftCard.gift();
	}
	
	

	@Given("user enters the amount {string} in amount section and selects valid inputs")
	public void user_enters_the_amount_in_amount_section_and_selects_valid_inputs(String string) {
		giftCard.Amount(string);
		
	}

	
	@Then("user clicks next button")
	public void user_clicks_next_button() {
		giftCard.nxt_button();
	}
	
	
	
	@Given("user enters the amount {string} in amount section and selects invalid inputs")
	public void user_enters_the_amount_in_amount_section_and_selects_invalid_inputs(String string) {
		giftCard.Amount(string);
	}



	@Given("user enters the invalid {string} in the form")
	public void user_enters_the_invalid_in_the_form(String string) {
		giftCard.sender_Email();
	}

}
