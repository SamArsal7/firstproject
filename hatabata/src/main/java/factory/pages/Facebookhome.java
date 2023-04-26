package factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookhome {
public WebDriver driver;
@FindBy(id = "email") WebElement emailfield;
@FindBy(id = "pass") WebElement passfield;
@FindBy(name = "login") WebElement loginfield;

public Facebookhome(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void Emailid(String eml) {
	emailfield.clear();
	emailfield.sendKeys(eml);
}
public void Password(String pas) {
	passfield.sendKeys(pas);
}
public void login() {
	loginfield.click();
}
}

