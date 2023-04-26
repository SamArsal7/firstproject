package Com.testy.hatabata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\h\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement EmailFinder = driver.findElement(By.id("email"));
		EmailFinder.sendKeys("abcdefg@gmail.com");
		WebElement paswdFinder = driver.findElement(By.name("pass"));
		paswdFinder.sendKeys("sartw3@7Y");
		Thread.sleep(8000);
		driver.quit();
		
	}

}
