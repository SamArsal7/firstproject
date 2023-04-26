package amazonregression;


import org.testng.annotations.Test;

import common.commoncode;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import factory.pages.Home;
import factory.pages.create;
import factory.pages.sign;

public class NewTest extends commoncode {
	
  @Test
  public void f()throws InterruptedException, IOException {
	 Home home = new Home(driver);
	 home.SignHoverPointer();
	 Thread.sleep(6000);
	 home.signinbuttonclick(); 
	 
		  Thread.sleep(4000);
	 sign a = new sign(driver);
	 a.ClickCreateBtn();
	 shots(null);
	 create b=new create(driver);
	 b.Customernamecharacter("jason");
	 b.Email("jason@protrainingtech.com");
	 shots(null);
	 b.Password("automationa");
	 b.Passwordcheck("automationa");
	 b.continueclick();
	 shots(null);
	 
  }
 
 

}
