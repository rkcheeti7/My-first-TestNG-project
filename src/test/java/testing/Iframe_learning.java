
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

 

public class Iframe_learning {

 

	

		WebDriver driver;

 

		@BeforeClass

		@Parameters({"url"})

		public void launch_the_application(String url) {

 

			System.out.println("I am launching heroku app");

			driver=new ChromeDriver();

 

			//Give url into the browser

			driver.get(url);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.manage().window().maximize();

 

		}


		@Test

		@Parameters({"title","url"})

		public void test_homepage_1(String title, String url) {


			driver.navigate().to(url);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			String runtime_title=driver.getTitle();


			Assert.assertEquals(title, runtime_title);

		}



		@Test

		public void frames_page() throws InterruptedException {

 

			//Navigate to Frames page				

			driver.findElement(By.xpath("//a[text()='Frames']")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


			System.out.println("Frames page is displayed");


			driver.findElement(By.xpath("//a[text()='iFrame']")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

 

			System.out.println("iFrames text box is displayed");


			//switch to iframe

			driver.switchTo().frame(0);


			//Clearing the text

			driver.findElement(By.xpath("//p[text()='Your content goes here.']")).clear();


			//Enter text

			driver.findElement(By.xpath("//p")).sendKeys("ABCD");

			Thread.sleep(5000);




			//Switching back to page header

			driver.switchTo().defaultContent();


			driver.findElement(By.xpath("//h3")).isDisplayed();


			//Navigating to back 

			driver.navigate().back();

			Thread.sleep(5000);

			//Navigating to forward

			driver.navigate().forward();

			Thread.sleep(5000);


		}

 

		@AfterClass

		public void close_the_application() {

			System.out.println("I am closing the page");

			driver.quit();

		}

}

