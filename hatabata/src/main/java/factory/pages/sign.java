package factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign {

	WebDriver driver;
	@FindBy( id="createAccountSubmit") WebElement createAccount;
	
	public sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickCreateBtn() {
		createAccount.click();
	}

}


