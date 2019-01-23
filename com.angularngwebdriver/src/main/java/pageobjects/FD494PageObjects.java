package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FD494PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement FileMaintainencemenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement InventoryStructuremaintainenceMenutwo(WebDriver driver)
	{
		 element=driver.findElement(By.id("fileMaintenaceMenu_inventoryStructureMaintMenuTwo"));
		//element=driver.findElement(By.xpath(".//*[@id='facts']/li[9]/h5/span"));
		 return element;
	}   
	
	public static WebElement AlternateDivisionMaintainence(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryStructureMaintMenuTwo_alternateDivisionMaintenance")); 
		//element=driver.findElement(By.xpath("//ul[@class='fa-ul']/li[14]/span"));
		 return element;
	}   
	
	public static WebElement DivisionAbbreviation(WebDriver driver)
	{
		element=driver.findElement(By.id("originalDivisionNbr"));
		 return element;
	}   
	
	public static WebElement AddItembutton(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("//div[@class='btn-group']/button[3]"));
		 return element;
	}

	public static WebElement AlternateDivision1Field(WebDriver driver)
	{
		 element=driver.findElement(By.id("alternateDivision1"));
		 return element;
	}
	
	public static WebElement AlternateDivision2Field(WebDriver driver)
	{
		 element=driver.findElement(By.id("alternateDivision2"));
		 return element;
	}
	
	public static WebElement EnterAddItemButton(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("//button[@title='Enter=Add']"));
		 return element;
	}
	
	public static WebElement F1Previous(WebDriver driver)
	{
		 element=driver.findElement(By.id("previous"));
		 return element;
	}
	
	public static WebElement UpdateButton(WebDriver driver)
	{
		 element=driver.findElement(ByAngular.buttonText("F11=Update"));
		 return element;
	}
	
	public static WebElement EndofJobButton(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("//div[@class='btn-group']/button[1]"));
		 return element;
	}
	
}







