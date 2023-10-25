package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_002 {

	WebDriver driver;

	@BeforeClass
	public void launch_application() {
		System.out.println("I am launching google chrome browser");

		driver=new ChromeDriver(); //this line is creating Chromedriver instance and storing it into driver variable

		//give url into the browser
		driver.get("https://www.vinsys.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();


	}



	@Test
	
	public void do_testing() {
			
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='logo']//img")).isDisplayed());
		
	}


	@Test
	public void do_testing_1() {
		System.out.println("My second TestNG testscript");

	}

	@AfterClass 
	public void close_application() {
		System.out.println("I am closing Google chrome");
		driver.quit();
	}








}
