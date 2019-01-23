package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FI423CLPageObjects {
	
	private static WebElement element=null;
	
	public static WebElement FileMantainencemenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}

	public static WebElement InventoryStructuremaintainenceMenuThree(WebDriver driver)
	{
		element=driver.findElement(By.id("fileMaintenaceMenu_inventoryStructureMaintMenuThree"));
		return element;
	}
	
	public static WebElement Scrappointmenu(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryStructureMaintMenuThree_scrapPointMaintenance"));
		return element;
	}
	
	public static WebElement ScrappointcodeField (WebDriver driver)
	{
		element=driver.findElement(By.id("ScrapPointCode"));
		return element;
	}
	
	public static WebElement AddButton (WebDriver driver)
	{
		element=driver.findElement(By.id("add"));
		return element;
	}
	
	public static WebElement ProductShapeCodeField(WebDriver driver)
	{
		element=driver.findElement(By.id("atshap"));
		return element;
	}
	
	public static WebElement WidthField(WebDriver driver)
	{
		element=driver.findElement(By.id("atwdth"));
		return element;
	}
	
	public static WebElement LengthField(WebDriver driver)
	{
		element=driver.findElement(By.id("atlnth"));
		return element;
	}
	
	public static WebElement CommentField(WebDriver driver)
	{
		element=driver.findElement(By.id("atcmt1"));
		return element;
	}
	
	public static WebElement AddscrapPointButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'ENTER=Add')]"));
		return element;
	}
	
	public static WebElement EndofJobButton(WebDriver driver)
	{
		//element=driver.findElement(By.xpath("//button[contains(text(),'F3=End Job')]"));
		// F3=End Job
		element=driver.findElement(ByAngular.buttonText("F3=End Job"));
		return element;
	}
	
	public static WebElement UpdateButton (WebDriver driver)
	{
		element=driver.findElement(By.id("update"));
		return element;
	}
	public static WebElement UpdateScrappointButton (WebDriver driver)
	{
		//element=driver.findElement(By.xpath("//button[contains(text(),'ENTER=Update')]"));
		element=driver.findElement(ByAngular.buttonText("ENTER=Update"));
		return element;
	}
	
	public static WebElement DeleteButton (WebDriver driver)
	{
		//element=driver.findElement(By.xpath("//button[text()='F4=Delete']"));
		element=driver.findElement(ByAngular.buttonText("F4=Delete"));
		return element;
	}
	
	public static WebElement DeletionResponseField (WebDriver driver)
	{
		element=driver.findElement(By.id("atans1"));
		return element;
	}
	public static WebElement DeleteScrappointButton (WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'ENTER=Delete')]"));
		return element;
	}
}
