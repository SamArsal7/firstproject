package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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

public class commoncode {
 public WebDriver driver;
  
  @BeforeClass
  @Parameters({"URI","Website"})
	  public void browser(String Browser, String Web) {
		  if(Browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\saima\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(Web);
			driver.manage().window().maximize();	
	  }
		  else if(Browser.equalsIgnoreCase("Firefox")){
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\saima\\eclipse-workspace\\hatabata\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get(Web);
				driver.manage().window().maximize();	
		  }
		  else if(Browser.equalsIgnoreCase("Edge")){
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\saima\\eclipse-workspace\\hatabata\\Driver\\msedgedriver.exe");
				driver=new EdgeDriver();
				driver.get(Web);
				driver.manage().window().maximize();	 
		  }
	  }
  

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	 // driver.close();
  }
  public void shots(String folder) throws IOException {
	  Date dt = new Date();
	  System.out.println(dt);
	  String si=dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(si);
	  File Capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(Capture, new File("C:\\Users\\saima\\eclipse-workspace\\hatabata\\pictures\\"+folder+"\\"+si+"Picture.png"));
  }
  
  }
