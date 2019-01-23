package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class IN880CLPageobjects {

private static WebElement element=null;
	
	public static WebElement InventoryMenuoption(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_inventoryMenu"));
		return element;
	}
	
	public static WebElement InventoryExceptionReports(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryMenu_inventoryExceptionReports"));
		return element;
	}
	
	public static WebElement TagVarianceReport(WebDriver driver)
	{
		element=driver.findElement(By.id("inventoryFileMaintenanceMenu_tagVarianceReport"));
		return element;
	}
	
	public static WebElement DistrictField(WebDriver driver)
	{
		element=driver.findElement(ByAngular.model("flatVariable.atdist"));
		return element;
	}
	
	public static WebElement EnterButton(WebDriver driver)
	{
		element=driver.findElement(ByAngular.buttonText("Enter=Select"));
		return element;
	}  
	
	public static WebElement EntertoReturnbutton(WebDriver driver)
	{
		element=driver.findElement(ByAngular.buttonText("Enter to return to  Menu"));
		return element;
	}                                                             
}
