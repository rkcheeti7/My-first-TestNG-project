package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_003 {

	WebDriver driver;

	@BeforeClass
	@Parameters({"url","email"})
	public void launch_application(String url, String email) {
		System.out.println(email);

		driver=new ChromeDriver(); //this line is creating Chromedriver instance and storing it into driver variable

		//give url into the browser
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();


	}

	@Test
	@Parameters({"title","url"})
	public void test_homepage_1(String title, String url) {
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String runtime_title=driver.getTitle();
		Assert.assertEquals(title, runtime_title);
		
		//validate contact us page
		contact_us_pagevalidation_2();
		
	}

	//@Test
	public void contact_us_pagevalidation_2() {
			
		//Navigate to Contact us page
		driver.findElement(By.xpath("//a[text()='Contact Us'][1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to get online case information. ']")).isDisplayed());
		
	    Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to calculate child support.']")).isDisplayed());
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to make a payment.']")).isDisplayed());
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to apply for services.']")).isDisplayed());
		
		
	}


	

	

	@AfterClass 
	public void close_application() {
		System.out.println("I am closing child support chrome");
		driver.quit();
	}


}
