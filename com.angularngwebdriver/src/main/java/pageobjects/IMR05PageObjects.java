package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMR05PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement Inventorymenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_inventoryMenu"));
		return element;
	}
	
	public static WebElement InventoryFilemaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryMenu_inventoryFileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement ItemMasterOnHandSubClassMaintMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryFileMaintenanceMenu_itemMasterOnHandSubClassMaint"));
		return element;
	}
	
	public static WebElement ItemNumberField(WebDriver driver)
	{
		element=driver.findElement(By.id("imr05-01_itemNumber"));
		return element;
	}
	
	public static WebElement Updatebutton(WebDriver driver)
	{
		element=driver.findElement(By.id("imr05-01_updateButton"));
		return element;
	}
	
	public static WebElement SubclassField(WebDriver driver)
	{
		element=driver.findElement(By.id("imr05-02_itemSubClass"));
		return element;
	}
	
	public static WebElement SubmitButton(WebDriver driver)
	{
		element=driver.findElement(By.id("imr05-02_enterUpdateButton"));
		return element;
	}
	
	public static WebElement Endjobbutton(WebDriver driver)
	{
		element=driver.findElement(By.id("imr05-01_endJobButton"));
		return element;
	}
	

}
