package amazonregression;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import common.commoncode;

public class listners extends commoncode implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	System.out.print("test started");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((commoncode)result.getInstance()).driver;
		try {
			shots("failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((commoncode)result.getInstance()).driver;
		try {
			shots("passed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
