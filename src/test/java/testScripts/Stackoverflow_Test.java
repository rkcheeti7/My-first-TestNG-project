package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import common.reusable;
import pageObject.Google_Page;
import pageObject.Stackoverflow_Page;


public class Stackoverflow_Test {
private WebDriver driver=null;
private reusable reu;
private Stackoverflow_Page SP;


@BeforeClass
public void setUp(){
reu=new reusable();
SP = new Stackoverflow_Page();
driver = reu.createDriverInstance();
driver.get(reu.getGlobalData("stackoverflow_url"));
}

@Test
public void test_the_elements(){
Assert.assertTrue(driver.findElement(SP. Stackoverflow_logo()).isDisplayed());
Assert.assertTrue(driver.findElement(SP.Product_link()).isDisplayed());
Assert.assertTrue(driver.findElement(SP.About_Header()).isDisplayed());
Assert.assertTrue(driver.findElement(SP.For_Teams()).isDisplayed());
Assert.assertTrue(driver.findElement(SP.Search_Box()).isDisplayed());



}

@AfterClass
public void tearDown(){
driver.quit();
}
}
