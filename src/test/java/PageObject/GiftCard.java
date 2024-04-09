package PageObject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


 
 
public class GiftCard  {
	public WebDriver driver;
	
	
	public GiftCard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//locators
	
	@FindBy(xpath ="//*[@id='header']/section/div/ul[2]/li[3]/a")
	WebElement Gift_cards;
	
	@FindBy(xpath = "//*[@id='app-container']/div/main/section/section[1]/ul/li[3]")
	WebElement Birthday_button;
	
	@FindBy(xpath = "//*[@id=\'ip_2251506436\']")
	WebElement searchbox_amt;
	
	@FindBy(xpath = "//*[@id=\"ip_4036288348\"]")
	WebElement Name_receiver;
	
	@FindBy(xpath = "//*[@id=\"ip_137656023\"]" )
	WebElement receiver_Email;
	
	@FindBy(xpath =  "//*[@id=\"ip_3177473671\"]")
	WebElement receiver_Number;
	
	@FindBy(xpath = "//*[@id=\"ip_1082986083\"]" )
	WebElement Name_sender;
	
	@FindBy(xpath =  "//*[@id=\"ip_4081352456\"]")
	WebElement sender_Email;
	
	@FindBy(xpath = "//*[@id=\"ip_2194351474\"]" )
	WebElement Sender_Address;
	
	@FindBy(xpath = "//*[@id=\"ip_567727260\"]")
	WebElement Sender_pincode;
	
	@FindBy(xpath = "//button[text()='Confirm']")
	WebElement Confirm_button;
	
	@FindBy(xpath = "//*[@id=\"ip_2121573464\"]")
	WebElement Sender_Number;
 
	@FindBy(xpath = "//*[@id=\'ip_2251506436\']" )
	WebElement amount;
	
	public void Amount(String price) {
		amount.sendKeys(price);
	}
	
	@FindBy(xpath = "//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button")
	WebElement button;
	
	@FindBy(xpath = "//button[text()='Confirm']")
	WebElement cnfrm_button;
	
	@FindBy(xpath = "//*[@id='search_button']/span")
	WebElement Gift_card;

	@FindBy(xpath = "//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button")
	WebElement nxt_button;
     
	@FindBy(xpath = "//*[@id=\"ip_582840596\"]")
	WebElement Message;

	@FindBy(xpath = "//*[@id='ip_137656023']")
	WebElement AlertMessage;
	
	//*[@id="ip_2251506436"]
	@FindBy(xpath = "//*[@id='app-container']/div/main/section/section[4]/div[2]/section[1]/div[2]")
	WebElement cnfrm_amt;
	
	@FindBy(xpath = "//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[1]/div[2]/div[1]")
    WebElement cnfrm_receiver_name;
	
	@FindBy(xpath = "//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[2]")
	WebElement cnfrm_sender_email;
	
	@FindBy(xpath = "//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[3]/div[2]")
	WebElement cnfrm_message;
	
	@FindBy(xpath = "//*[@id='search_button']/span")
	WebElement search_button;
	
	JavascriptExecutor j=(JavascriptExecutor)driver;

	public void nxt_button() {
		try {
		nxt_button.click();
		}
		catch(Exception e){
			System.out.println("User enter the Invalid Input");
		}
	}
	
	public WebElement search_btn() {
		return search_button;
	}
 
	public void homeButtonGiftCard_click() {
		
		Gift_cards.click();
		
	}
	public void gift() {
		
		Actions act=new Actions(driver);
		act.moveToElement(Birthday_button);
		Birthday_button.click();
		//j.executeScript("arguments[0].scrollIntoView(true)", Birthday_button);
		//j.executeScript("arguments[0].click()", Birthday_button);
		
	}
	
	public void click_giftcard() {
		
		
		Gift_card.click();
	}
	
	public WebElement Name_receiver() {
		return Name_receiver;
	}
	
	public WebElement searchbox_amt() {
		return searchbox_amt;
	}
	
	public WebElement receiver_Email() {
		return receiver_Email;
	}
	
	public WebElement receiver_Number() {
		return receiver_Number;
	}
	
	public WebElement Name_sender() {
		return Name_sender;
	}
	
	public WebElement sender_Email() {
		return sender_Email;
	}
	
	public WebElement Sender_Address() {
		return Sender_Address;
	}
	
	
	public WebElement Sender_pincode() {
		return Sender_pincode;
	}
	
	public WebElement Confirm_button() {
		return Confirm_button;
	}
	
	public WebElement Sender_Number() {
		return Sender_Number;
	}
	
	public WebElement Send_message() {
		
		Message.click();
		return Message;
	}
	
	public String AlertMessage() {
		
		return AlertMessage.getAttribute("validationMessage");
		
	}
	
	public WebElement cnfrm_amt_validation() {
		
		return cnfrm_amt;
	}
	
	public WebElement cnfrm_rname_validation() {
		return cnfrm_receiver_name;
	}
	
	public WebElement cnfrm_message_validation() {
		return cnfrm_message;
	}
	
	public WebElement cnfrm_semail_validation() {
		return cnfrm_sender_email;
		
	}

	

	
}
 