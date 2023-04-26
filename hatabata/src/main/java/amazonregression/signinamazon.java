package amazonregression;
import factory.pages.Home;
import org.testng.annotations.Test;
import common.commoncode;
import factory.pages.Facebookhome;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Properties;


public class signinamazon extends commoncode{
  @Test (groups={"Functional"})
  public void f() throws InterruptedException,IOException {
	   Facebookhome ob=new Facebookhome(driver); 
	  /* Properties prop=new Properties();
	   FileInputStream da=new FileInputStream("C:\\Users\\saima\\eclipse-workspace\\hatabata\\src\\amazon.properties");
		  prop.load(da);
		  String id=prop.getProperty("Email");
		  String st=prop.getProperty("Passwd");
		  System.out.print(id);
		 ob.Emailid(id);
		  ob.Password(st);
		/*System.out.print("this to print the value of ="+n);
		  System.out.print("this to print the value of ="+s);
		  ob.login();
		  Thread.sleep(6000);
		  driver.navigate().back();
		  System.out.println("this to execute functional test");*/
	 
  Home an=new Home(driver);
  an.findlinks();
  }
@Test (groups={"Regression"})
	public void Regression() {
		System.out.println("this to execute regression test");
	}

@Test (groups={"adhoc" })
	public void adhoc() {
		System.out.println("this to execute adhoc test");
}
}