package amazonregression;

import org.testng.annotations.Test;

import common.commoncode;
import factory.pages.Facebookhome;
import org.testng.annotations.DataProvider;

public class Signfb extends commoncode {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  Facebookhome ob=new Facebookhome(driver);
	  ob.Emailid(n);
	  ob.Password(s);
System.out.print("this to print the value of ="+n);
System.out.print("this to print the value of ="+s);
	  ob.login();
	  Thread.sleep(6000);
	  driver.navigate().back();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "jason@protrainingtech.com", "abcd5673y8gh" },
      new Object[] { "john@protrainingtech.com", "khjd76487308" },
    };
  }
}
