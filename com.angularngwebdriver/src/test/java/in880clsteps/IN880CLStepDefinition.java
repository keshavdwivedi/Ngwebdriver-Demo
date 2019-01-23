package in880clsteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.IN880CLPageobjects;

public class IN880CLStepDefinition {
	
	WebDriver in880ddriver;
	NgWebDriver in880ngdriver;
	//  Logger log=Logger.getLogger("IN880CLStepDefinition");
	public IN880CLStepDefinition() {
		this.in880ddriver=Baseclass.getbaseclassdriver();	
		this.in880ngdriver=Baseclass.getbaseclassngdriver();
		//  PropertyConfigurator.configure("log4j.properties");
	}
	
	@When("^we Navigate by menu$")
	public void we_Navigate_by_menu() {
		
	  in880ngdriver.waitForAngularRequestsToFinish();
	  IN880CLPageobjects.InventoryMenuoption(in880ddriver).click();
	  in880ngdriver.waitForAngularRequestsToFinish();
	  IN880CLPageobjects.InventoryExceptionReports(in880ddriver).click();
	  in880ngdriver.waitForAngularRequestsToFinish();
	  IN880CLPageobjects.TagVarianceReport(in880ddriver).click();
	}
	
	@When("^we Remove District$")
	public void we_Remove_District() {
	   in880ngdriver.waitForAngularRequestsToFinish();
	   IN880CLPageobjects.DistrictField(in880ddriver).clear();
	}
	
	@Then("^Select Enter=Select button$")
	public void select_Enter_Select_button() {
		in880ngdriver.waitForAngularRequestsToFinish();
	  IN880CLPageobjects.EnterButton(in880ddriver).click();
	}
	
	@Then("^Select Enter to return to Menu$")
	public void select_Enter_to_return_to_Menu() {
		in880ngdriver.waitForAngularRequestsToFinish();
		IN880CLPageobjects.EntertoReturnbutton(in880ddriver).click();
	}
	
	@Then("^Back to menu selection screen$")
	public void back_to_menu_selection_screen() {
		in880ngdriver.waitForAngularRequestsToFinish();
	 String text= in880ddriver.findElement(ByAngular.binding("menuName")).getText();
	 Assert.assertEquals(text,"Tag Variance Report","Assertion Failed Menu screen not reached");
	 
	}

}
