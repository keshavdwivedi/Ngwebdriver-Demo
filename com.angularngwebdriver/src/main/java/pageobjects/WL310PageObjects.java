package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class WL310PageObjects {
	
	private static WebElement element=null;
	
	public static WebElement InventoryMenuoption(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_inventoryMenu"));
		return element;
	}
	
	public static WebElement ItemwarehouseMenuoption(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryMenu_itemWarehouseLocationInquiry"));
		return element;
	} 
	
	public static WebElement Itemnumberfield(WebDriver driver)
	{
		element=driver.findElement(ByAngular.model("flatVariable.atmitem"));
		return element;
	}
	
	public static WebElement EnterTocontinueButton(WebDriver driver)
	{
        element=driver.findElement(ByAngular.buttonText("Enter=Continue"));
        return element;
	}
	
	public static WebElement Selectcheckbox(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@type='checkbox']"));
		return element;
	}
	
	public static WebElement SearchButtonn(WebDriver driver)
	{
        element=driver.findElement(By.xpath("//div[@class='btn-group']/button[4]"));
        return element;
	}
	
	public static WebElement F3EndofJobButton(WebDriver driver)
	{
		element=driver.findElement(ByAngular.buttonText("F3=End Job"));
		return element;
	}
	
	public static WebElement PreviousButton(WebDriver driver)
	{
		element=driver.findElement(ByAngular.buttonText("F1=Previous"));
		return element;
	}
	
	

}
