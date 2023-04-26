package Com.testy.hatabata;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pointers {
	public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saima\\eclipse-workspace\\hatabata\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		
		// WebElement sign=driver.findElement(By.xpath("//*[text()='Hello, sign in']"));
		  Actions ob = new Actions(driver); 
		/* ob.moveToElement(sign).build().perform();
		 * 
		 * WebElement order=driver.findElement(By.xpath("//*[text()='Orders']"));
		 * ob.moveToElement(order).click().build().perform();
		 */
		
		/*
		 * Thread.sleep(6000); driver.switchTo().frame(0); WebElement
		 * dragables=driver.findElement(By.id("draggable")); WebElement
		 * dropables=driver.findElement(By.id("droppable"));
		 * ob.dragAndDrop(dragables,dropables).build().perform();
		 * driver.switchTo().parentFrame(); WebElement
		 * resizeable=driver.findElement(By.linkText("Resizable")); resizeable.click();
		 */
		/*
		 * Thread.sleep(4000); driver.switchTo().frame(0); WebElement
		 * Size=driver.findElement(By.
		 * xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"
		 * )); ob.dragAndDropBy(Size, 50, 50).build().perform();
		 */
	WebElement pic=driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
	Thread.sleep(6000);
	ob.contextClick(pic).build().perform();
	}

}
