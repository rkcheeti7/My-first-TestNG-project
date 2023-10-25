package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;

public class Test_suite {
	
	WebDriver driver;

	@BeforeSuite
	
	public void launch_application() {
		System.out.println("Launch the application");
				
	}
	
	@AfterSuite
	public void close_application() {
		System.out.println("I am closing Google chrome");
			}

	

}
