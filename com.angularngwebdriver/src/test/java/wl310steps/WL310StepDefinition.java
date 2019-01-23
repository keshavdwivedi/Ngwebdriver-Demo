package wl310steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.WL310PageObjects;

public class WL310StepDefinition {
	
	WebDriver wl310driver;
	NgWebDriver wl310ngdriver;
	//public  Logger logger=Logger.getLogger(WL310StepDefinition.class);
	
	public WL310StepDefinition() {
		this.wl310driver=Baseclass.getbaseclassdriver();
		this.wl310ngdriver=Baseclass.getbaseclassngdriver();
	}

	@When("^We navigate by menu$")
	 public void We_navigate_by_menu() {
		wl310ngdriver.waitForAngularRequestsToFinish();
	    WL310PageObjects.InventoryMenuoption(wl310driver).click();
	    wl310ngdriver.waitForAngularRequestsToFinish();
	    WL310PageObjects.ItemwarehouseMenuoption(wl310driver).click();
	   // logger.info("Menu navigation done");
	 }
	 @Then("^Enter item and Press Enter=continue$")
	 public void enter_item_and_Press_Enter_continue() {
		 wl310ngdriver.waitForAngularRequestsToFinish();
	     WL310PageObjects.Itemnumberfield(wl310driver).sendKeys("47841");
	     WL310PageObjects.EnterTocontinueButton(wl310driver).click();
	     //logger.info("Item entered");
	 }
	 
	 @Then("^Select Item number$")
	 public void select_Item_number()  {
		 wl310ngdriver.waitForAngularRequestsToFinish();
	    if(!WL310PageObjects.Selectcheckbox(wl310driver).isSelected())
	    {
	    WL310PageObjects.Selectcheckbox(wl310driver).click();
	    }
	    
	  
	 }
	 
	 @Then("^Press End of Job button$")
	 public void press_End_of_Job_button()  {
	    wl310ngdriver.waitForAngularRequestsToFinish();
	    WL310PageObjects.F3EndofJobButton(wl310driver).click();
	
	 }
	 
	 @Then("^Press Search button$")
	 public void press_Search_button() {
		WL310PageObjects.SearchButtonn(wl310driver).click();
		
	 }
	 
	 @Then("^press Previous key twice$")
	 public void press_Previous_key_twice() {
		wl310ngdriver.waitForAngularRequestsToFinish();
	   WL310PageObjects.PreviousButton(wl310driver).click();
	  wl310ngdriver.waitForAngularRequestsToFinish();
	   WL310PageObjects.PreviousButton(wl310driver).click();
	 }
	 
	 @Then("^returned to menu screen$")
	 public void returned_to_menu_screen() {
		 
		 wl310ngdriver.waitForAngularRequestsToFinish();
	      String text= wl310driver.findElement(ByAngular.binding("menuName")).getText();
	      Assert.assertEquals(text,"Inventory Menu","Assertion Failed Menu screen not reached");
	 }

}
