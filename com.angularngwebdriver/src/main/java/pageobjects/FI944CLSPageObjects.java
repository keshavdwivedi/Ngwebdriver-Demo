package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FI944CLSPageObjects {
	
	private static WebElement element=null;
	
	public static WebElement FileMaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement Inventorystructuremaintainencemenutwo(WebDriver driver)
	{
		element=driver.findElement(By.id("fileMaintenaceMenu_inventoryStructureMaintMenuTwo"));
		return element;
	}
	
	public static WebElement Districtproductclassfilelist(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryStructureMaintMenuTwo_districtProductClassFileList"));
		return element;
	}
	public static WebElement Enterbutton(WebDriver driver)
	{
		element=driver.findElement(By.id("Submit"));
		return element;
	}
}
