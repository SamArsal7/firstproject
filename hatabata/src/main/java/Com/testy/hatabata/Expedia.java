package Com.testy.hatabata;
//TODO Auto-generated method stub
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {

			public static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\h\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://expedia.com");
				driver.manage().window().maximize();
				
				
				WebElement checkin=driver.findElement(By.id("d1-btn"));
				checkin.click();
				Thread.sleep(6000);
				WebElement date=driver.findElement(By.xpath("//*[@aria-label='Mar 30, 2023']"));
				date.click();
				WebElement done=driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
				done.click();
	}

}
