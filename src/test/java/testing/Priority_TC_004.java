package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Priority_TC_004 {
	
	WebDriver driver;

	@BeforeClass
	
	public void launch_application() {
		System.out.println("Launch the application");
				
	}
	
	@Test(priority=2)
	public void homepage_validation() {
		System.out.println("Testing Home page");
	}
	
	@Test(priority=1)
	public void signin_page_validation() {
		System.out.println("Testing sign in page");
	}
	
	@Test(priority=0)
	public void signout_page_validation() {
		System.out.println("Testing sign out page");
	} 
	
	@Test(priority=3)
	public void cart_page_validation() {
		System.out.println("Testing cart page");
	}

	@AfterClass 
	public void close_application() {
		System.out.println("I am closing Google chrome");
			}

	
	
	
}
