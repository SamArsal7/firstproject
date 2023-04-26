package Com.testy.hatabata;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\saima\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	WebElement searchbox=driver.findElement(By.xpath("//*[@name='field-keywords']"));
	searchbox.sendKeys("computer");
	//searchbox.sendKeys(Keys.ENTER);
	Actions ob=new Actions(driver);
	//ob.sendKeys(searchbox, Keys.ENTER).perform();
	ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	Thread.sleep(4000);
	ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(4000);
	ob.sendKeys(Keys.DELETE);
	Thread.sleep(4000);
	ob.sendKeys(Keys.chord(Keys.CONTROL+"v")).build().perform();
	Thread.sleep(4000);



	}

}
