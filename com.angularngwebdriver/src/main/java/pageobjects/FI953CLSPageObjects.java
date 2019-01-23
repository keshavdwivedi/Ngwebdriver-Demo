package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FI953CLSPageObjects {
	
	private static WebElement element=null;
	
	public static WebElement MaterialprocessingMenu(WebDriver driver)
	{
		element=driver.findElement(By.id("mainMenu_mainMaterialProcessingMenu"));
		return element;
	}
	
	public static WebElement MatprocMenuOption(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//ul[@id='facts']/li[2]/h5/span"));
		return element;
	}
	
	public static WebElement BacklogFileListMenuOption(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//ul[@class='fa-ul']/li[10]/span"));
		return element;
	}
	
	public static WebElement Enterbutton(WebDriver driver)
	{
		element=driver.findElement(ByAngular.buttonText("Enter to return to  Menu"));
		return element;
	}

}
