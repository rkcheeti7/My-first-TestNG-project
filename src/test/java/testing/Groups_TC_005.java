package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class Groups_TC_005 {
	
	WebDriver driver;

	@BeforeGroups
	
	public void launch_application() {
		System.out.println("Launch the application");
				
	}
	
	@Test(groups= {"regression"})
	public void homepage_validation() {
		System.out.println("Testing Home page");
	}
	
	@Test(groups= {"regression"})
	public void signin_page_validation() {
		System.out.println("Testing sign in page");
	}
	
	@Test(groups= {"smoke"})
	public void signout_page_validation() {
		System.out.println("Testing sign out page");
	} 
	
	@Test(groups= {"e2en"})
	public void cart_page_validation() {
		System.out.println("Testing cart page");
	}

	@AfterGroups
	public void close_application() {
		System.out.println("I am closing Google chrome");
			}

	
	
	
}
