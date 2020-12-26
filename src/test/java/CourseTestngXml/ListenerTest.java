package CourseTestngXml;

import org.testng.ITestContext;		
import org.testng.ITestListener;		
import org.testng.ITestResult;	

/*
 * Not getting �Add unimplemented methods� error in eclipse
 * >> Right click(on the Listeners class ) -> go to source-> click on overide/implement methods -> select the 
 * check boxes for the ITest listener (make sure all check box inside it should be checked )->click on oK.
 */

public class ListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		
		System.out.println("Method Test started(Before every method)");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
		System.out.println("Method successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		System.out.println("Method Failure (take screenshot)+ Method name= "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
		System.out.println("Method skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
		System.out.println("Overall Test can be considered partially successful");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
		System.out.println("THE START (@BeforeClass-Initial setup)");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
		System.out.println("THE END (@AfterClass-close browser)");
	}
  
	
}
