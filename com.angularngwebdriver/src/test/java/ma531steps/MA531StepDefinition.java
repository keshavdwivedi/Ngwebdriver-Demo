package ma531steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.MA531PageObjects;

public class MA531StepDefinition {
	
	WebDriver ma531driver;
	NgWebDriver ma531ngdriver;
	public MA531StepDefinition() {
		this.ma531driver=Baseclass.getbaseclassdriver();
		this.ma531ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@Given("^navigate through the menu of the program$")
	public void navigate_through_the_menu_of_the_program() {
      ma531ngdriver.waitForAngularRequestsToFinish();
	  MA531PageObjects.MiscellanousMenu(ma531driver).click();
	  ma531ngdriver.waitForAngularRequestsToFinish();
	  MA531PageObjects.PrintncontrolMenu(ma531driver).click();
	  ma531ngdriver.waitForAngularRequestsToFinish();
	  MA531PageObjects.ApplicationEmailWDivisionMaintMenu(ma531driver).click();
	  ma531ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^Key in company \"([^\"]*)\", division \"([^\"]*)\", and program \"([^\"]*)\"$")
	public void key_in_company_division_and_program(String company , String division, String programid) {
	MA531PageObjects.CompanyField(ma531driver).clear();
	MA531PageObjects.CompanyField(ma531driver).sendKeys(company);
	MA531PageObjects.DivisionField(ma531driver).sendKeys(division);
	MA531PageObjects.ProgramidField(ma531driver).sendKeys(programid);
	}
	
	@Then("^press Add to continue to next screen$")
	public void press_Add_to_continue_to_next_screen() {
	 MA531PageObjects.AddButton(ma531driver).click();
	 ma531ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Key in email Address$")
	public void key_in_email_Address() {
	 MA531PageObjects.EmailAddress1Field(ma531driver).sendKeys("TESTEAM@RUSSELMETALS>COM");
	}
	
	@Then("^press Continue Button$")
	public void press_Continue_Button() {
		 ((JavascriptExecutor)ma531driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 MA531PageObjects.ContinueButton(ma531driver).click();
		 ma531ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^press End of job Button$")
	public void press_End_of_job_Button(){
	MA531PageObjects.EndofJobButton(ma531driver).click();
	}
	
	@Then("^press Update to continue to next screen$")
	public void press_Update_to_continue_to_next_screen() {
	  MA531PageObjects.UpdateButton(ma531driver).click();
	  ma531ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Key in second email Address$")
	public void key_in_second_email_Address() {
	 MA531PageObjects.Emailadress2Field(ma531driver).sendKeys("TDOBBIE@RUSSELMETALS>COM");
	}

	@Then("^press Delete to continue to next screen$")
	public void press_Delete_to_continue_to_next_screen() {
    MA531PageObjects.DeleteButton(ma531driver).click();
    ma531ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Return to menu$")
	public void Return_to_menu() {
		ma531ngdriver.waitForAngularRequestsToFinish();
		String str=ma531driver.findElement(ByAngular.binding("menuName")).getText();
		 Assert.assertEquals(str,"Miscellaneous Menu","Assertion Failed Menu screen not reached");
	}
}
