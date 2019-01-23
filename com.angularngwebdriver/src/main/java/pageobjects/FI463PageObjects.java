package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FI463PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement FileMaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement FinancialMaintainenceMenuTwo(WebDriver driver)
	{
		element=driver.findElement(By.id("fileMaintenaceMenu_financialInfoMaintMenuTwo"));
		return element;
	}
	
	public static WebElement ARAgingMaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("fianacialInfoMaintMenuTwo_arAgingDays"));
		return element;
	}
	
	public static WebElement EnterYearField(WebDriver driver)
	{
		element=driver.findElement(By.id("atyear"));
		return element;
	}
	
	public static WebElement Addbutton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F10=Add']"));
		return element;
	}
	
	public static WebElement AgingDateField(WebDriver driver)
	{
		element=driver.findElement(By.id("atardt"));
		return element;
	}
	
	public static WebElement EntertoAddbutton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'ENTER=Add')]"));
		return element;
	}
	
	public static WebElement Updatebutton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F11=Update']"));
		return element;
	}
	
	public static WebElement EntertoUpdatebutton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'ENTER=Update')]"));
		return element;
	}
	
	public static WebElement EndJobbutton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F3=End Job']"));
		return element;
	}
	
	public static WebElement DeletionResponsefield(WebDriver driver)
	{
		element=driver.findElement(By.id("atans1"));
		return element;
	}
	
	public static WebElement EntertoContinueButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='ENTER=Continue']"));
		return element;
	}
	
	public static WebElement DeleteButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F4=Delete']"));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
