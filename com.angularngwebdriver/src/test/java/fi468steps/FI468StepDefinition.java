package fi468steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import basepackage.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FI468PageObjects;

public class FI468StepDefinition {
	
	WebDriver fi468driver;
	NgWebDriver fi468ngdriver;
   
	public FI468StepDefinition ()
	{
		this.fi468driver=Baseclass.getbaseclassdriver();
		this.fi468ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@Given("^We navigate by program menu$")
	public void we_navigate_by_program_menu() throws Exception {
	   FI468PageObjects.FileMaintainenceMenu(fi468driver).click();
	   fi468ngdriver.waitForAngularRequestsToFinish();
	   FI468PageObjects.GeneralFileCompMainMenu(fi468driver).click();
	   fi468ngdriver.waitForAngularRequestsToFinish();
	   FI468PageObjects.CountryLanguageMaintainenceMenu(fi468driver).click();
	   fi468ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^we Enter Country code$")
	public void we_Enter_Country_code() {
	  FI468PageObjects.CountryCode(fi468driver).sendKeys("CAN");
	  
	}
	
	@Then("^press Add Button$")
	public void press_Add_Button() {
	  FI468PageObjects.AddButton(fi468driver).click();
	  fi468ngdriver.waitForAngularRequestsToFinish();
	 
	}
	
	@When("^enter country name$")
	public void enter_country_name() {
	  FI468PageObjects.Countryname(fi468driver).sendKeys("CANADA");
	}
	
	@Then("^press entertoadd Button$")
	public void press_entertoadd_Button() {
	 FI468PageObjects.EntertoAdd(fi468driver).click();

	  fi468ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^press end job button$")
	public void press_end_job_button() throws Exception {
	   FI468PageObjects.EndJob(fi468driver).click();
	  
	}

	@Then("^press Update Button$")
	public void press_Update_Button()  {
    FI468PageObjects.UpdateButton(fi468driver).click();
 
    fi468ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^change federal tax code value$")
	public void change_federal_tax_code_value() {
	   FI468PageObjects.FederalTax(fi468driver).clear();
	   FI468PageObjects.FederalTax(fi468driver).sendKeys("Y");
	}
	
	@Then("^press entertoupdate Button$")
	public void press_entertoupdate_Button() {
	   FI468PageObjects.EntertoUpdate(fi468driver).click();
	
	}
	
	@Then("^press Delete Button$")
	public void press_Delete_Button() {
	   FI468PageObjects.DeleteButton(fi468driver).click();

	}
	
	@Then("^enter Y in deletion response code field$")
	public void enter_Y_in_deletion_response_code_field() {
	  FI468PageObjects.DeleteResponseCode(fi468driver).clear();
	  FI468PageObjects.DeleteResponseCode(fi468driver).sendKeys("Y");
	}
	
	@Then("^press enterdelete button$")
	public void press_enterdelete_button() {
	  FI468PageObjects.EntertoDelete(fi468driver).click();
	
	  fi468ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^return Back to menu$")
	public void return_Back_to_menu() {
		fi468ngdriver.waitForAngularRequestsToFinish();
	      String text= fi468driver.findElement(ByAngular.binding("menuName")).getText();
	      Assert.assertEquals(text,"General Comp. Info. Maint. Menu One","Assertion Failed Menu screen not reached");

	}

}
