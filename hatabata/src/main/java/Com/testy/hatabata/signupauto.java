package Com.testy.hatabata;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupauto {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saima\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement account= driver.findElement(By.xpath("//*[text()='Create new account']"));
		account.click();
		Thread.sleep(6000);
		
		WebElement Fnamefield= driver.findElement(By.xpath("//*[@name='firstname']"));
		Fnamefield.sendKeys("ajkjkjkj");
		
		WebElement LastFname= driver.findElement(By.xpath("//input[@name='lastname']"));
		LastFname.sendKeys("sam");
		
		WebElement mobilenumber= driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobilenumber.sendKeys("03098765431");
		
		WebElement password= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("samionygv4D*");
		
		WebElement birthmonth= driver.findElement(By.name("birthday_month"));
		Select month=new Select(birthmonth);
		month.selectByValue("3");
		Thread.sleep(6000);
		
		WebElement date= driver.findElement(By.name("birthday_day"));
		Select day=new Select(date);
		day.selectByValue("3");
		Thread.sleep(6000);
		
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select byear=new Select(year);
		byear.selectByValue("1994");
		Thread.sleep(6000);
	
		WebElement gender= driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
				
	}

}
