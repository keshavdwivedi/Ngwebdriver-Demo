package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IM440PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement FileMaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement VendorInformationMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("fileMaintenaceMenu_vendorInformationMaintenance"));
		return element;
	}
	
	public static WebElement VendorCapacityMaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("vendorInformationMaintenanceMenu_vendorCapacityMaintenanceFile"));
		return element;
	}
	
	public static WebElement VendorNumber(WebDriver driver)
	{
		element=driver.findElement(By.id("vendorNbr"));
		return element;
	}
	
	public static WebElement VendorClass(WebDriver driver)
	{
		element=driver.findElement(By.id("x_3PositionClassV3clas"));
		return element;
	}
	
	public static WebElement MinThickness(WebDriver driver)
	{
		element=driver.findElement(By.id("s2e1mn"));
		return element;
	}
	
	public static WebElement MaxThickness(WebDriver driver)
	{
		element=driver.findElement(By.id("s2e1mx"));
		return element;
	}
	
	public static WebElement Minlength(WebDriver driver)
	{
		element=driver.findElement(By.id("s2e3mn"));
		return element;
	}
	
	public static WebElement Maxlength(WebDriver driver)
	{
		element=driver.findElement(By.id("s2e3mx"));
		return element;
	}
	
	public static WebElement EnterButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='ENTER=Continue']")); 
		return element;
	}
	
	public static WebElement EndjobButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[text()='F3=End Job']"));
		return element;
	}
	
	public static WebElement AddButton(WebDriver driver)
	{
		element=driver.findElement(By.id("add"));
		return element;
	}
	
	public static WebElement UpdateButton(WebDriver driver)
	{
		element=driver.findElement(By.id("update"));
		return element;
	}
	
	public static WebElement DeleteButton(WebDriver driver)
	{
		element=driver.findElement(By.id("eoj"));
		return element;
	}
	
	public static WebElement DeleteResponseField(WebDriver driver)
	{
		element=driver.findElement(By.id("atdelet"));
		return element;
	}
	
	public static WebElement DeleteEnterbutton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//form[@name='flatPanel']/div[2]/button[@type='submit']"));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}
