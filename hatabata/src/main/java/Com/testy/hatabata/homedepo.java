package Com.testy.hatabata;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class homedepo {
	public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saima\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.homedepot.com");
			driver.manage().window().maximize();
			
			WebElement signup= driver.findElement(By.xpath("(//*[text()='My Account'])[1]"));
			signup.click();
			Thread.sleep(6000);
			
			WebElement account= driver.findElement(By.xpath("(//*[@class='bttn__content'])[3]"));
			account.click();
			Thread.sleep(6000);
			
			WebElement personalaccount= driver.findElement(By.xpath("(//*[text()= 'Select & Continue'])[1]"));
			personalaccount.click();
			Thread.sleep(6000);
			
			WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys("abc@yahoo.com");
			
			WebElement password= driver.findElement(By.xpath("//input[@id='password-input-field']"));
			password.sendKeys("samionygv4D*");
			Thread.sleep(6000);
			
			WebElement zipcode= driver.findElement(By.xpath("//input[@id='zipCode']"));
			zipcode.sendKeys("70623");
			
			WebElement phone= driver.findElement(By.xpath("//input[@id='phone']"));
			phone.sendKeys("03098765431");
			
			/*
			 * WebElement createaccount=
			 * driver.findElement(By.xpath("(//*[text()='Create an Account'])[2]"));
			 * createaccount.click();
			 */
			
	}

}
