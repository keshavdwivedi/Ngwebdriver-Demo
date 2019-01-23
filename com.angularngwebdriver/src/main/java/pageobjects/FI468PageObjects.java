package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FI468PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement FileMaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement GeneralFileCompMainMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("fileMaintenaceMenu_generalCompInfoMaintMenuOne"));
		return element;
	}
	
	public static WebElement CountryLanguageMaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("generalCompanyInfoMenuOne_countrylanguagefilemaintenance"));
		return element;
	}
	
	public static WebElement CountryCode(WebDriver driver)
	{
		element=driver.findElement(By.id("country"));
		return element;
	}
	
	public static WebElement AddButton(WebDriver driver)
	{
		element=driver.findElement(By.id("add"));
		return element;
	}
	
	public static WebElement Countryname(WebDriver driver)
	{
		element=driver.findElement(By.id("x_15PositionDescription"));
		return element;
	}
	
	public static WebElement EntertoAdd(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'Enter = ADD')]"));
		return element;
	}
	
	public static WebElement EndJob(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F3=End Job']"));
		return element;
	}
	
	public static WebElement UpdateButton(WebDriver driver)
	{
		element=driver.findElement(By.id("update"));
		return element;
	}
	
	public static WebElement FederalTax(WebDriver driver)
	{
		element=driver.findElement(By.id("atfdtx"));
		return element;
	}
	
	public static WebElement EntertoUpdate(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'Enter = UPDATE')]"));
		return element;
	}
	
	public static WebElement DeleteButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F4=Delete']"));
		return element;
	}
	
	public static WebElement DeleteResponseCode(WebDriver driver)
	{
		element=driver.findElement(By.id("atans1"));
		return element;
	}
	
	public static WebElement EntertoDelete(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'Enter = DELETE')]"));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
