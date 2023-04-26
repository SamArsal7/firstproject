package Com.testy.hatabata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\h\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement ppup=driver.findElement(By.id("alertButton"));
		ppup.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
	}

}
