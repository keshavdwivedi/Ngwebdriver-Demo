package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MA531PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement MiscellanousMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_miscellaneousMenu"));
		return element;
	}
	
	public static WebElement PrintncontrolMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("miscellaneousMenu_printControlMenu"));
		return element;
	}
	
	public static WebElement ApplicationEmailWDivisionMaintMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("printControlMenu_applicationEmailMaintWDivision"));
		return element;
	}
	
	public static WebElement CompanyField(WebDriver driver)
	{
		element=driver.findElement(By.id("company"));
		return element;
	}
	
	public static WebElement DivisionField(WebDriver driver)
	{
		element=driver.findElement(By.id("division"));
		return element;
	}
	
	public static WebElement ProgramidField(WebDriver driver)
	{
		element=driver.findElement(By.id("programId"));
		return element;
	}
	
	public static WebElement AddButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F10=Add']"));
		return element;
	}
	
	public static WebElement EmailAddress1Field(WebDriver driver)
	{
		element=driver.findElement(By.id("eMailAddressMamai1"));
		return element;
	}
	
	public static WebElement ContinueButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='Enter=Continue']"));
		return element;
	}
	
	public static WebElement Emailadress2Field(WebDriver driver)
	{
		element=driver.findElement(By.id("eMailAddressMamai2"));
		return element;
	}
	
	public static WebElement UpdateButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F11=Update']"));
		return element;
	}
	
	public static WebElement DeleteButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F4=Delete']"));
		return element;
	}
	
	public static WebElement EndofJobButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F3= End Job']"));
		return element;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
