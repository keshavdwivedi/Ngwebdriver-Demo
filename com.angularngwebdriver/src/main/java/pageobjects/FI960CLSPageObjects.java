package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FI960CLSPageObjects {
	
	private static WebElement element=null;
	
	public static WebElement Filemaintainencemenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_fileMaintenanceMenu"));
		return element;
	}
	
	public static WebElement GeneralcompmaintainencemenuOne(WebDriver driver)
	{
		element= driver.findElement(By.id("fileMaintenaceMenu_generalCompInfoMaintMenuOne"));
		return element;
	}
	
	public static WebElement SalesmanMasterFileListing(WebDriver driver)
	{
		element=driver.findElement(By.id("generalCompanyInfoMenuOne_salesmanMasterFileListing"));
		return element;
	}
	
	public static WebElement Enterbutton(WebDriver driver)
	{
		element=driver.findElement(ByAngular.buttonText("Enter to return to Menu"));
		return element;
	}
	
	//AR422PageObjects.CreditLimit(ar422driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"9999999");

}
