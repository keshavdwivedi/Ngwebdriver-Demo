package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FI431PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement Inventorymenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement FinanacialInfomaintMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("fileMaintenaceMenu_financialInfoMaintMenuOne"));
		return element;
	}
	
	public static WebElement UsefileMaintMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("financialInfoFileMaintMenuOne_useTaxFileMaintenance"));
		return element;
	}
	
	public static WebElement StateAbbreviationField(WebDriver driver)
	{
		element=driver.findElement(By.id("atstate"));
		return element;
	}
	
	public static WebElement Addbutton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F10=Add']"));
		return element;
	}
	
	public static WebElement TaxrateField(WebDriver driver)
	{
		element=driver.findElement(By.id("useTaxRate"));
		return element;
	}
	
	public static WebElement TaxrateDescriptionField(WebDriver driver)
	{
		element=driver.findElement(By.id("taxRateDescription"));
		return element;
	}
	
	public static WebElement TaxGLNumberField(WebDriver driver)
	{
		element=driver.findElement(By.id("taxGlNumber"));
		return element;
	}
	
	public static WebElement EnterAddButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'ENTER=Add')]"));
		return element;
	}
	
	public static WebElement EndJobButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F3=End Job']"));
		return element;
	}
	
	public static WebElement UpdateButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F11=Update']"));
		return element;
	}
	
	public static WebElement EnterUpdateButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'ENTER=Update')]"));
		return element;
	}
	
	public static WebElement DeleteButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F4=Delete']"));
		return element;
	}
	
	public static WebElement DeleteresponseCode(WebDriver driver)
	{
		element=driver.findElement(By.id("atans1"));
		return element;
	}
	
	public static WebElement EntertoDeleteButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='ENTER=Continue']"));
		return element;
	}
	
}
