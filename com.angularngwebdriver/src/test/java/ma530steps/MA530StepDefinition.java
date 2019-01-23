package ma530steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import basepackage.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.MA530PageObjects;

public class MA530StepDefinition {
	
	WebDriver ma530driver;
	NgWebDriver ma530ngdriver;
	public MA530StepDefinition() 
	{
		this.ma530driver=Baseclass.getbaseclassdriver();
		this.ma530ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@Given("^navigate through menu of program$")
	public void navigate_through_menu_of_program() {
     ma530ngdriver.waitForAngularRequestsToFinish();		
	 MA530PageObjects.Miscellanousmenu(ma530driver).click();
	 ma530ngdriver.waitForAngularRequestsToFinish();	
	 MA530PageObjects.Miscellanousprintcontrolmenu(ma530driver).click();
	 ma530ngdriver.waitForAngularRequestsToFinish();	
	 MA530PageObjects.ApplicationEmailMaintainencemenu(ma530driver).click();
	 ma530ngdriver.waitForAngularRequestsToFinish();	
	}
	
	@When("^Key in company number \"([^\"]*)\", order district \"([^\"]*)\" and program ID \"([^\"]*)\"$")
	public void key_in_company_number_order_district_and_program_ID(String companynumber, String orderdistrict, String programid) {
		MA530PageObjects.CompanyField(ma530driver).clear();
		MA530PageObjects.CompanyField(ma530driver).sendKeys(companynumber);
		MA530PageObjects.OrderDistrictField(ma530driver).clear();
		MA530PageObjects.OrderDistrictField(ma530driver).sendKeys(orderdistrict);
		MA530PageObjects.programIDField(ma530driver).clear();
		MA530PageObjects.programIDField(ma530driver).sendKeys(programid);
	}
	
	@Then("^Select Add to continue button$")
	public void select_Add_to_continue_button() {
	    MA530PageObjects.AddButton(ma530driver).click();
	    ma530ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Key in email address$")
	public void key_in_email_address() {
	    MA530PageObjects.EmailaddressField1(ma530driver).sendKeys("TESTEAM@RUSSELMETALS.COM");
	}
	
	@Then("^press continue button$")
	public void press_continue_button() {
		 ((JavascriptExecutor)ma530driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    MA530PageObjects.ContinueButton(ma530driver).click();
		 ma530ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^press end of job button$")
	public void press_end_of_job_button(){
	   MA530PageObjects.EndJob(ma530driver).click();
	}
	
	@Then("^Select Update to continue button$")
	public void select_Update_to_continue_button() {
	 MA530PageObjects.UpdateButton(ma530driver).click();
	 ma530ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Key in Second email address$")
	public void key_in_Second_email_address() {
	 MA530PageObjects.EmailaddressField2(ma530driver).sendKeys("TDOBBIE@RUSSELMETALS.COM");
	}
	
	@Then("^Select Delete to continue button$")
	public void select_Delete_to_continue_button() {
	  MA530PageObjects.DeleteButton(ma530driver).click();
		 ma530ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^Key in company number \"([^\"]*)\" and program ID \"([^\"]*)\"$")
	public void key_in_company_number_and_program_ID(String companynumber, String programid) {
		MA530PageObjects.CompanyField(ma530driver).clear();
		MA530PageObjects.CompanyField(ma530driver).sendKeys(companynumber);
	  MA530PageObjects.programIDField(ma530driver).sendKeys(programid);
	}
	@Then("^return To menu$")
	public void return_To_menu() {
		ma530ngdriver.waitForAngularRequestsToFinish();
	      String text= ma530driver.findElement(ByAngular.binding("menuName")).getText();
	      Assert.assertEquals(text,"Miscellaneous Menu","Assertion Failed Menu screen not reached");
	}
	

}
