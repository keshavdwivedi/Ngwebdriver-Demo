package fi431steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FI431PageObjects;

public class FI431StepDefintion {
	
	WebDriver fi431driver;
	NgWebDriver fi431ngdriver;
	
	public FI431StepDefintion() 
	{
		this.fi431driver=Baseclass.getbaseclassdriver();
		this.fi431ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@When("^navigate through program menu$")
	public void navigate_through_program_menu() {
		fi431ngdriver.waitForAngularRequestsToFinish();
	    FI431PageObjects.Inventorymenu(fi431driver).click();
	    fi431ngdriver.waitForAngularRequestsToFinish();
	    FI431PageObjects.FinanacialInfomaintMenu(fi431driver).click();
	    fi431ngdriver.waitForAngularRequestsToFinish();
	    FI431PageObjects.UsefileMaintMenu(fi431driver).click();
	    fi431ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^Enter abbreviation code and press Add button$")
	public void enter_abbreviation_code_and_press_Add_button() {
	FI431PageObjects.StateAbbreviationField(fi431driver).sendKeys("AK");
	FI431PageObjects.Addbutton(fi431driver).click();
	fi431ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Enter Data in fields$")
	public void enter_Data_in_fields() {
	    //FI431PageObjects.TaxrateField(fi431driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"0.8");
	    FI431PageObjects.TaxrateField(fi431driver).clear();
	    FI431PageObjects.TaxrateField(fi431driver).sendKeys("0.8");
	    FI431PageObjects.TaxrateDescriptionField(fi431driver).sendKeys("HARMONIZED SALES TAG");
	    FI431PageObjects.TaxGLNumberField(fi431driver).clear();
	    FI431PageObjects.TaxGLNumberField(fi431driver).sendKeys("2302000000");
	}

	@Then("^Press Enter to Add button$")
	public void press_Enter_to_Add_button() {
	   FI431PageObjects.EnterAddButton(fi431driver).click();
	}
	
	@Then("^press Endofjob button$")
	public void press_Endofjob_button() {
		fi431ngdriver.waitForAngularRequestsToFinish();
	    FI431PageObjects.EndJobButton(fi431driver).click();
	}
	
	@When("^Enter Abbreviation code and press Update button$")
	public void enter_Abbreviation_code_and_press_Update_button()  {
		FI431PageObjects.StateAbbreviationField(fi431driver).sendKeys("AK");
		FI431PageObjects.UpdateButton(fi431driver).click();
		fi431ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Update data of fields$")
	public void update_data_of_fields() {
		FI431PageObjects.TaxrateDescriptionField(fi431driver).clear();
		FI431PageObjects.TaxrateDescriptionField(fi431driver).sendKeys("HARMONIZED SALES TAX");
		FI431PageObjects.TaxGLNumberField(fi431driver).clear();
		FI431PageObjects.TaxGLNumberField(fi431driver).sendKeys("2305000000");
	}
	
	@Then("^Press Enter to Update button$")
	public void press_Enter_to_Update_button() {
		 FI431PageObjects.EnterUpdateButton(fi431driver).click();
	}
	
	@When("^Enter Abbreviation code and press Delete button$")
	public void enter_Abbreviation_code_and_press_Delete_button()  {
		FI431PageObjects.StateAbbreviationField(fi431driver).sendKeys("AK");
		FI431PageObjects.DeleteButton(fi431driver).click();
	}
	
	@Then("^Enter Y in response code field$")
	public void enter_Y_in_response_code_field() {
	    //FI431PageObjects.DeleteresponseCode(fi431driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"Y");
	    FI431PageObjects.DeleteresponseCode(fi431driver).clear();
	    FI431PageObjects.DeleteresponseCode(fi431driver).sendKeys("Y");
	    
	}

	@Then("^Press Enter to Delete button$")
	public void press_Enter_to_Delete_button() {
	 FI431PageObjects.EntertoDeleteButton(fi431driver).click();
	}
	
	@Then("^enter to return$")
	 public void return_to_main_menu() {
		fi431ngdriver.waitForAngularRequestsToFinish();
	      String text= fi431driver.findElement(ByAngular.binding("menuName")).getText();
	      Assert.assertEquals(text,"Use Tax File Maintenance","Assertion Failed Menu screen not reached");
	  }
}
