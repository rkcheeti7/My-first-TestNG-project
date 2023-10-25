package pageObject;

import org.openqa.selenium.By;


public class Stackoverflow_Page {


public By Stackoverflow_logo(){return By.xpath("(//span[text()='Stack Overflow'])[1]");}
public By About_Header(){return By.xpath("(//a[text()='About'])[1]");}
public By Product_link(){return By.xpath("(//a[contains(.,'Products')])[1]");}
public By For_Teams(){return By.xpath("//a[text()='For Teams']");}
public By Search_Box(){return By.xpath("//input[@name='q']");}










}
