package fd494steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FD494PageObjects;

public class FD494StepDefinition {
	
	WebDriver fd494driver;
	NgWebDriver fd494ngdriver;
	public FD494StepDefinition()
	{
		this.fd494driver=Baseclass.getbaseclassdriver();
		this.fd494ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@When("^Navigate through the menu$")
	public void navigate_through_the_menu() throws Exception {
		fd494ngdriver.waitForAngularRequestsToFinish();
	   FD494PageObjects.FileMaintainencemenu(fd494driver).click();
	   fd494ngdriver.waitForAngularRequestsToFinish();
	   ((JavascriptExecutor)fd494driver).executeScript("arguments[0].scrollIntoView(true);",FD494PageObjects.InventoryStructuremaintainenceMenutwo(fd494driver));
	   FD494PageObjects.InventoryStructuremaintainenceMenutwo(fd494driver).click();
	   fd494ngdriver.waitForAngularRequestsToFinish();
	   FD494PageObjects.AlternateDivisionMaintainence(fd494driver).click();
	   
	}
	@When("^Enter division name$")
	public void enter_division_name() {
	 FD494PageObjects.DivisionAbbreviation(fd494driver).sendKeys("JMS");
	}
	
	@When("^Press Add Item Button$")
	public void press_Add_Item_Button(){
		 fd494ngdriver.waitForAngularRequestsToFinish();
		FD494PageObjects.AddItembutton(fd494driver).click();
	}
	
	@Then("^Enter multiple Alternate division name$")
	public void enter_multiple_Alternate_division_name(){
		 fd494ngdriver.waitForAngularRequestsToFinish();
	    FD494PageObjects.AlternateDivision1Field(fd494driver).sendKeys("JMS");
	    FD494PageObjects.AlternateDivision2Field(fd494driver).sendKeys("JMSP");
	}
	
	@Then("^Press Add Button$")
	public void press_Add_Button() {
		((JavascriptExecutor)fd494driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   FD494PageObjects.EnterAddItemButton(fd494driver).click();
	   fd494ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Press Previous button$")
	public void press_Previous_button() {
	    FD494PageObjects.F1Previous(fd494driver).click();
	}
	
	@Then("^Press Update button$")
	public void press_Update_button() {
		 fd494ngdriver.waitForAngularRequestsToFinish();
		FD494PageObjects.UpdateButton(fd494driver).click();
	}
	
	@Then("^Press EndofJob button$")
	public void press_EndofJob_button() {
		 fd494ngdriver.waitForAngularRequestsToFinish();
		FD494PageObjects.EndofJobButton(fd494driver);
	}
	

 @Then("^return to main menu$")
 public void return_to_main_menu() {
	 fd494ngdriver.waitForAngularRequestsToFinish();
      String text= fd494driver.findElement(ByAngular.binding("menuName")).getText();
      Assert.assertEquals(text,"Alternate Division File Maintenance","Assertion Failed Menu screen not reached");
  }

	
	
}
