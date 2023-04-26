package Com.testy.hatabata;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class annotationclass {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.print("test execution start");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.print("test execution ends");
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\saima\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass()throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }


  @Test
  public void newrelease() {
	  driver.findElement(By.linkText("New Releases")).click();
  }
  

}
