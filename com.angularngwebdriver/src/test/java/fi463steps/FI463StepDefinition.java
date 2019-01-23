package fi463steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FI463PageObjects;

public class FI463StepDefinition {

	WebDriver fi463driver;
	NgWebDriver fi463ngdriver;
	
	public FI463StepDefinition() {
		
		this.fi463driver=Baseclass.getbaseclassdriver();
		this.fi463ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@Given("^we navigate through menu$")
	public void we_navigate_through_menu() throws Exception {
		 fi463ngdriver.waitForAngularRequestsToFinish();
         FI463PageObjects.FileMaintainenceMenu(fi463driver).click();
         fi463ngdriver.waitForAngularRequestsToFinish();
         FI463PageObjects.FinancialMaintainenceMenuTwo(fi463driver).click();
         fi463ngdriver.waitForAngularRequestsToFinish();
         FI463PageObjects.ARAgingMaintainenceMenu(fi463driver).click();
         fi463ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^enter year value$")
	public void enter_year_value() {
	  FI463PageObjects.EnterYearField(fi463driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"18");
	}
	
	@Then("^click on Add record button$")
	public void click_on_Add_record_button() {
	  FI463PageObjects.Addbutton(fi463driver).click();
	  fi463ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^enter aging date$")
	public void enter_aging_date() {
	   FI463PageObjects.AgingDateField(fi463driver).sendKeys("00010118");
	}
	
	@Then("^Press Enter to add button$")
	public void press_Enter_to_add_button() {
	  FI463PageObjects.EntertoAddbutton(fi463driver).click();
	}
	
	@Then("^select End Job button$")
	public void select_End_Job_button() {
    fi463ngdriver.waitForAngularRequestsToFinish();
	FI463PageObjects.EndJobbutton(fi463driver).click();
	}
	
	@Then("^click on Update record button$")
	public void click_on_Update_record_button() {
	 FI463PageObjects.Updatebutton(fi463driver).click();
	 fi463ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^change aging date$")
	public void change_aging_date() {
	FI463PageObjects.AgingDateField(fi463driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"0010218");
	}
	
	@Then("^press Enter to update button$")
	public void press_Enter_to_update_button() {
	FI463PageObjects.EntertoUpdatebutton(fi463driver).click();
	}
	
	@Then("^click on Delete record button$")
	public void click_on_Delete_record_button() {
		FI463PageObjects.DeleteButton(fi463driver).click();
		 fi463ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^enter response code for deletion as Y$")
	public void enter_response_code_for_deletion_as_Y() {
	 FI463PageObjects.DeletionResponsefield(fi463driver).clear();
	 FI463PageObjects.DeletionResponsefield(fi463driver).sendKeys("Y");
	}
	
	@Then("^press Enter to Delete button$")
	public void press_Enter_to_Delete_button() {
	  FI463PageObjects.EntertoContinueButton(fi463driver).click();
	}
	
	@Then("^return to Menu$")
	public void return_to_Menu() {
		 fi463ngdriver.waitForAngularRequestsToFinish();
	      String text= fi463driver.findElement(ByAngular.binding("menuName")).getText();
	      Assert.assertEquals(text,"Financial Info. File Maint. Menu Two","Assertion Failed Menu screen not reached");
	}


	
	
}
