package ac020steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AC020PageObjects;

public class AC020StepDefintion {

	 WebDriver ac020driver;
	 NgWebDriver ac020ngdriver;
	 public AC020StepDefintion() {
		this.ac020driver=Baseclass.getbaseclassdriver();
		this.ac020ngdriver=Baseclass.getbaseclassngdriver();
	}
	 
	 @Given("^we navigate by menu$")
	 public void we_navigate_by_menu() {
		 ac020ngdriver.waitForAngularRequestsToFinish();
		 AC020PageObjects.FilemaintainenceMenu(ac020driver).click();
		 ac020ngdriver.waitForAngularRequestsToFinish();
		 ((JavascriptExecutor)ac020driver).executeScript("arguments[0].scrollIntoView(true);",AC020PageObjects.POCuttingToolMaintainenceMenu(ac020driver));
		 AC020PageObjects.POCuttingToolMaintainenceMenu(ac020driver).click();
		 ac020ngdriver.waitForAngularRequestsToFinish();
		 AC020PageObjects.AddChargeProPickupMenu(ac020driver).click();
	 }
	 
	 @When("^enter district number$")
	 public void enter_district_number() {
		 ac020ngdriver.waitForAngularRequestsToFinish();
		 AC020PageObjects.DistrictNumber(ac020driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"20");
	 }
	 
	 @Then("^enter additional charge code$")
	 public void enter_additional_charge_code() {
		 AC020PageObjects.AdditionalChargeCode(ac020driver).sendKeys("PRO");
	 }
	 
	 @Then("^press UpdatechargeCode button$")
	 public void press_UpdatechargeCode_button() {
		 ((JavascriptExecutor)ac020driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  AC020PageObjects.UpdateButton(ac020driver).click();
	 }
	 
	 @Then("^press Exit button$")
	 public void press_Exit_button() {
		 ac020ngdriver.waitForAngularRequestsToFinish();
		 AC020PageObjects.ExitButton(ac020driver).click();
	 }
	 
	 @Then("^remove additional charge code$")
	 public void remove_additional_charge_code() {
		 ac020ngdriver.waitForAngularRequestsToFinish();
		 AC020PageObjects.AdditionalChargeCode(ac020driver).clear();
	 }
	 
	 @Then("^Returned to menu screen$")
	 public void returned_to_menu_screen() {
      ac020ngdriver.waitForAngularRequestsToFinish();
      String text= ac020driver.findElement(ByAngular.binding("menuName")).getText();
      Assert.assertEquals(text,"Pricing,Cutting Tol. Code Maintenance","Assertion Failed Menu screen not reached");
	 }
}
