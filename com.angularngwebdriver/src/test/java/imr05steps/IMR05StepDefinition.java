package imr05steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.IMR05PageObjects;

public class IMR05StepDefinition {
	
	WebDriver imr05driver;
	NgWebDriver imr05ngdriver;
	
	public IMR05StepDefinition() {
	
		this.imr05driver=Baseclass.getbaseclassdriver();
		this.imr05ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@When("^navigate by program menu$")
	public void navigate_by_program_menu() {
	   IMR05PageObjects.Inventorymenu(imr05driver).click();
	   imr05ngdriver.waitForAngularRequestsToFinish();
	   IMR05PageObjects.InventoryFilemaintainenceMenu(imr05driver).click();
	   imr05ngdriver.waitForAngularRequestsToFinish();
	   IMR05PageObjects.ItemMasterOnHandSubClassMaintMenu(imr05driver).click();
	   imr05ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^Enter Item number$")
	public void enter_Item_number() {
	   IMR05PageObjects.ItemNumberField(imr05driver).sendKeys("47841");
	}

	@Then("^user Update button$")
	public void user_Update_button() {
	  IMR05PageObjects.Updatebutton(imr05driver).click();
	  imr05ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Enter Item subclass$")
	public void enter_Item_subclass() {
	    IMR05PageObjects.SubclassField(imr05driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"CQ PQ");
	}
	
	@Then("^Press Enter=update button$")
	public void press_Enter_update_button() {
	   IMR05PageObjects.SubmitButton(imr05driver).click();
	   imr05ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^press End button$")
	public void press_End_button() {
		IMR05PageObjects.Endjobbutton(imr05driver).click();
	}

	
	

}
