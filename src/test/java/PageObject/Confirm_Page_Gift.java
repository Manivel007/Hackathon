package PageObject;


import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Confirm_Page_Gift  extends BasePage{

		 List<HashMap<String, String>> datamap; //Data driven
		 
		public Confirm_Page_Gift(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[4]/div[2]/section[3]/div[2]/div[1]/div[2]/div[1]")WebElement To_name;
		@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[4]/div[2]/section[3]/div[2]/div[1]/div[2]/div[2]")WebElement To_mail;
		@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[4]/div[2]/section[3]/div[2]/div[1]/div[2]/div[3]")WebElement To_mobile;
		@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[1]") WebElement From_name;
		@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[2]") WebElement From_mail;
		@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[3]") WebElement From_mobile;
		@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[4]") WebElement From_address;
		@FindBy(xpath="//*[@id='app-container']/div/main/section/section/div[2]") WebElement page;
		
		public void valid_details(String rname,String remail,String rmobile,String cname,String cemail,String cmobile,String caddress) {
		
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds (20));
		    wait.until(ExpectedConditions.visibilityOf( page));
		         	Assert.assertEquals(cname,From_name.getText());
					Assert.assertEquals(cemail,From_mail.getText());
					Assert.assertEquals(cmobile,From_mobile.getText());
					Assert.assertEquals(caddress,From_address.getText());		
					Assert.assertEquals(rname,To_name.getText());
					Assert.assertEquals(remail,To_mail.getText());
					Assert.assertEquals(rmobile,To_mobile.getText());
			}
					
		

		
		}