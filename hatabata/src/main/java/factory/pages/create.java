package factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create {
	WebDriver driver;
	@FindBy(id="ap_customer_name") WebElement customername;
	@FindBy(id="ap_email") WebElement emailid;
	@FindBy(id="ap_password") WebElement pasword;
	@FindBy(id="ap_password_check") WebElement paswd;
	@FindBy(id="continue") WebElement continuebutn;
	
	public create(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void Customernamecharacter(String name) {
		customername.sendKeys( name);
	}
	public void Email(String email) {
		
		emailid.sendKeys(email);
	}
	public void Password(String password) {
		pasword.sendKeys(password);
	}
	public void Passwordcheck(String check) {
		paswd.sendKeys(check);
	}
	public void continueclick() {
		continuebutn.click();
	}
	
	
}
