package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MA530PageObjects {

	private static WebElement element=null;
	
	public static WebElement Miscellanousmenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_miscellaneousMenu"));
		return element;
	}
	
	public static WebElement Miscellanousprintcontrolmenu(WebDriver driver)
	{
		element=driver.findElement(By.id("miscellaneousMenu_printControlMenu"));
		return element;
	}
	
	public static WebElement ApplicationEmailMaintainencemenu(WebDriver driver)
	{
		element=driver.findElement(By.id("printControlMenu_applicationEmailMaintt"));
		return element;
	}
	
	public static WebElement CompanyField(WebDriver driver)
	{
		element=driver.findElement(By.id("company"));
		return element;
	}
	
	public static WebElement OrderDistrictField(WebDriver driver)
	{
		element=driver.findElement(By.id("district"));
		return element;
	}
	
	public static WebElement programIDField(WebDriver driver)
	{
		element=driver.findElement(By.id("programId"));
		return element;
	}
	
	public static WebElement AddButton(WebDriver driver)
	{
		element=driver.findElement(By.id("add"));
		return element;
	}
	
	public static WebElement EmailaddressField1(WebDriver driver)
	{
		element=driver.findElement(By.id("eMailAddressMamai1"));
		return element;
	}
	
	public static WebElement ContinueButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//form[@name='flatPanel']/div[1]/button[2]"));
		return element;
	}
	
	public static WebElement EndJob(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F3= End Job']"));
		return element;
	}
	
	public static WebElement EmailaddressField2(WebDriver driver)
	{
		element=driver.findElement(By.id("eMailAddressMamai2"));
		return element;
	}
	
	public static WebElement DeleteButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F4=Delete']"));
		return element;
	}
	

	public static WebElement UpdateButton(WebDriver driver)
	{
		element=driver.findElement(By.id("update"));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
