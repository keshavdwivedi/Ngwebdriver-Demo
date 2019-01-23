package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class AC020PageObjects {
	
private static WebElement element=null;
	
	public static WebElement FilemaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement POCuttingToolMaintainenceMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("fileMaintenaceMenu_priceCuttingTolCodeMaint"));
		return element;
	}
	
	public static WebElement AddChargeProPickupMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("PricingCuttingTolCodeMaint_AdditionalChargeForProcessingMaintenance"));
		return element;
	}
	
	public static WebElement DistrictNumber(WebDriver driver)
	{
		element=driver.findElement(ByAngular.model("flatVariable.nbrDist"));
		return element;
	}
	
	public static WebElement AdditionalChargeCode(WebDriver driver)
	{
		element=driver.findElement(ByAngular.model("row.additionalChargeCode"));
		return element;
	}
	
	public static WebElement UpdateButton(WebDriver driver)
	{
		element=driver.findElement(ByAngular.buttonText("Enter=Update"));
		return element;
	}
	
	public static WebElement ExitButton(WebDriver driver)
	{
		element=driver.findElement(ByAngular.buttonText("F3=Exit"));
		return element;
	}
	
	
	
	

}
