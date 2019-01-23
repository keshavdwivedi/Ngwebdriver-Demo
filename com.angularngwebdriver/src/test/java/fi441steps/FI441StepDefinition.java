package fi441steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FI441PageObjects;

public class FI441StepDefinition {
	
	WebDriver fi441driver;
	NgWebDriver fi441ngdriver;
	
	public FI441StepDefinition() {
		
		this.fi441driver=Baseclass.getbaseclassdriver();
		this.fi441ngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@When("^navigate through menu$")
	public void navigate_through_menu() {
		fi441ngdriver.waitForAngularRequestsToFinish();
	  FI441PageObjects.FileMantainencemenu(fi441driver).click();
	  fi441ngdriver.waitForAngularRequestsToFinish();
	  ((JavascriptExecutor)fi441driver).executeScript("arguments[0].scrollIntoView(true);",FI441PageObjects.InventoryStructuremaintainencemenuOne(fi441driver));
	  FI441PageObjects.InventoryStructuremaintainencemenuOne(fi441driver).click();
	  fi441ngdriver.waitForAngularRequestsToFinish();
	  FI441PageObjects.OnepositionClassfilemaintainence(fi441driver).click();
	  fi441ngdriver.waitForAngularRequestsToFinish();
	}
	
	@When("^we enter one position class$")
	public void we_enter_one_position_class() {
	    FI441PageObjects.OnepositionClassField(fi441driver).sendKeys("P");
	}
	
	@Then("^press add button$")
	public void press_add_button() {
	  FI441PageObjects.Addbutton(fi441driver).click();
	  fi441ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^enter class description$")
	public void enter_class_description() {
	   FI441PageObjects.ClassDescriptionField(fi441driver).sendKeys("PLASTIC");
	}
	
	@Then("^enter equalizing factor$")
	public void enter_equalizing_factor() {
	   FI441PageObjects.EqualizingFactorField(fi441driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");
	}
	
	@Then("^enter budget turns$")
	public void enter_budget_turns() {
	    FI441PageObjects.BudgetturnField(fi441driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"6");
	}
	
	@Then("^press submit button$")
	public void press_submit_button() {
	   FI441PageObjects.button(fi441driver).click();
	   fi441ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^press EndofJob button$")
	public void press_EndofJob_button()  {
		fi441ngdriver.waitForAngularRequestsToFinish();
		FI441PageObjects.EndofJobbutton(fi441driver).click();
	}

	@Then("^update budget turns$")
	public void update_budget_turns() {
		 FI441PageObjects.BudgetturnField(fi441driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"5");
	}
	
	@Then("^enter update button$")
	public void enter_update_button() {
	  FI441PageObjects.Updatebutton(fi441driver).click();
	  fi441ngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^we enter Y in delete confirm field$")
	public void we_enter_Y_in_delete_confirm_field() {
		//FI441PageObjects.DeletionConfirmField(fi441driver).clear();
	// FI441PageObjects.DeletionConfirmField(fi441driver).sendKeys("Y");
	 FI441PageObjects.DeletionConfirmField(fi441driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"Y");
	}
	
	@Then("^enter delete button$")
	public void enter_delete_button() {
		FI441PageObjects.Deletebutton(fi441driver).click();
	}
	
	@Then("^return to menu$")
	public void return_to_menu() {
		fi441ngdriver.waitForAngularRequestsToFinish();
	      String text= fi441driver.findElement(ByAngular.binding("menuName")).getText();
	      Assert.assertEquals(text,"ONE POSITION CLASS - FILE MAINTENANCE","Assertion Failed Menu screen not reached");
	}
	

	

	



}
