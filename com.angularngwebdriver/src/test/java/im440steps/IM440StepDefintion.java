package im440steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import basepackage.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.IM440PageObjects;


public class IM440StepDefintion {
	
	WebDriver im440driver;
	NgWebDriver im440ngdriver;
	
	public IM440StepDefintion() {
		this.im440driver=Baseclass.getbaseclassdriver();
		this.im440ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@Given("^Navigate through program menu$")
	public void navigate_through_program_menu(){
	  IM440PageObjects.FileMaintainenceMenu(im440driver).click();
	  im440ngdriver.waitForAngularRequestsToFinish();
	  ((JavascriptExecutor)im440driver).executeScript("arguments[0].scrollIntoView(true);",IM440PageObjects.VendorInformationMenu(im440driver));
	  IM440PageObjects.VendorInformationMenu(im440driver).click();
	  im440ngdriver.waitForAngularRequestsToFinish();
	  IM440PageObjects.VendorCapacityMaintainenceMenu(im440driver).click();
	  im440ngdriver.waitForAngularRequestsToFinish();
	  }
	
	@When("^Enter company number and vendor number and class$")
	public void enter_company_number_and_vendor_number_and_class() {
	    IM440PageObjects.VendorNumber(im440driver).clear();
	    IM440PageObjects.VendorNumber(im440driver).sendKeys("172");
	    IM440PageObjects.VendorClass(im440driver).sendKeys("CBF");
	}
	
	@Then("^Press Add Record Button$")
	public void press_Add_Record_Button() {
	   IM440PageObjects.AddButton(im440driver).click();
	   im440ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^We enter Min and Max values of Thickness and Length$")
	public void we_enter_Min_and_Mac_values_of_Thickness_and_Length() {
	   IM440PageObjects.MinThickness(im440driver).sendKeys("1");
	   IM440PageObjects.MaxThickness(im440driver).sendKeys("999");
	   IM440PageObjects.Minlength(im440driver).sendKeys("1");
	   IM440PageObjects.Maxlength(im440driver).sendKeys("999");
	}
	
	@Then("^Press Enter button$")
	public void press_Enter_button() {
		((JavascriptExecutor)im440driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebDriverWait w=new WebDriverWait(im440driver, 10);
		w.until(ExpectedConditions.visibilityOf(IM440PageObjects.EnterButton(im440driver)));
	    IM440PageObjects.EnterButton(im440driver).click();
	    im440ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Press End of job button$")
	public void press_End_of_job_button()
	{
	    IM440PageObjects.EndjobButton(im440driver).click();
	    im440ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Press Update Record button$")
	public void press_Update_Record_button() {
		 IM440PageObjects.UpdateButton(im440driver).click();
		  im440ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^we change the Min and max values of Thickness and length$")
	public void we_change_the_Min_and_max_values_of_Thickness_and_length() {
		IM440PageObjects.MinThickness(im440driver).clear();
		IM440PageObjects.MinThickness(im440driver).sendKeys(".125");
		IM440PageObjects.Minlength(im440driver).clear();
		IM440PageObjects.Minlength(im440driver).sendKeys(".125");
	}
	
	@Then("^Press Delete Record button$")
	public void press_Delete_Record_button() {
		 IM440PageObjects.DeleteButton(im440driver).click();
		 im440ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Enter Y in Response code field$")
	public void enter_Y_in_Response_code_field() {
		IM440PageObjects.DeleteResponseField(im440driver).clear();
		IM440PageObjects.DeleteResponseField(im440driver).sendKeys("Y");
	}
	
	@Then("^Press Enter button to delete$")
	public void press_Enter_button_to_delete() {
		((JavascriptExecutor)im440driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		IM440PageObjects.DeleteEnterbutton(im440driver).click();	
		 im440ngdriver.waitForAngularRequestsToFinish();
	}
	@Then("^return back to menu$")
	public void return_back_to_menu() {
		im440ngdriver.waitForAngularRequestsToFinish();
	      String text= im440driver.findElement(ByAngular.binding("menuName")).getText();
	      Assert.assertEquals(text,"VENDOR CAPABILITY MAINTENANCE","Assertion Failed Menu screen not reached");
	}
}
