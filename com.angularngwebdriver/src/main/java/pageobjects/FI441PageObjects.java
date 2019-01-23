package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FI441PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement FileMantainencemenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement InventoryStructuremaintainencemenuOne(WebDriver driver)
	{
		element=driver.findElement(By.id("fileMaintenaceMenu_inventoryStructureMaintMenuOne"));
		return element;
	}
	
	public static WebElement OnepositionClassfilemaintainence(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryStructureMaintMenuOne_onePositionClassFileMaint"));
		return element;
	}
	
	public static WebElement OnepositionClassField(WebDriver driver)
	{
		element=driver.findElement(By.id("itemClassOne"));
		return element;
	}
	
	public static WebElement ClassDescriptionField(WebDriver driver)
	{
		element=driver.findElement(By.id("classOneDescription"));
		return element;
	}
	
	public static WebElement EqualizingFactorField(WebDriver driver)
	{
		element=driver.findElement(By.id("equalizingFactor"));
		return element;
	}
	
	public static WebElement BudgetturnField(WebDriver driver)
	{
		element=driver.findElement(By.id("budgettedTurns"));
		return element;
	}
	
	public static WebElement button(WebDriver driver)
	{
		element=driver.findElement(By.id("atentr"));
		return element;
	}
	
	public static WebElement DeletionConfirmField(WebDriver driver)
	{
		element=driver.findElement(By.id("atans1"));
		return element;
	}
	
	public static WebElement Addbutton(WebDriver driver)
	{
		element=driver.findElement(By.id("add"));
		return element;
	}
	
	public static WebElement Updatebutton(WebDriver driver)
	{
		element=driver.findElement(By.id("update"));
		return element;
	}
	
	public static WebElement Deletebutton(WebDriver driver)
	{
		element=driver.findElement(By.id("delete"));
		return element;
	}
	
	public static WebElement EndofJobbutton(WebDriver driver)
	{
		element=driver.findElement(By.id("end job"));
		return element;
	}

}
