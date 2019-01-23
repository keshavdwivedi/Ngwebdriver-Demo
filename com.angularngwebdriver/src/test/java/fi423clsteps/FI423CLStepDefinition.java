package fi423clsteps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FI423CLPageObjects;

public class FI423CLStepDefinition {
	
	WebDriver fi423cldriver;
	NgWebDriver fi423clngdriver;
	public FI423CLStepDefinition() {
		this.fi423cldriver=Baseclass.getbaseclassdriver();
		this.fi423clngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@When("^navigate through the menu$")
	public void navigate_through_the_menu() throws Exception {
		fi423clngdriver.waitForAngularRequestsToFinish();
	   FI423CLPageObjects.FileMantainencemenu(fi423cldriver).click();
	   fi423clngdriver.waitForAngularRequestsToFinish();
	   ((JavascriptExecutor)fi423cldriver).executeScript("arguments[0].scrollIntoView(true);",FI423CLPageObjects.InventoryStructuremaintainenceMenuThree(fi423cldriver));
	   FI423CLPageObjects.InventoryStructuremaintainenceMenuThree(fi423cldriver).click();
	   fi423clngdriver.waitForAngularRequestsToFinish();
	   FI423CLPageObjects.Scrappointmenu(fi423cldriver).click();
	   fi423clngdriver.waitForAngularRequestsToFinish();
	}

	@When("^we enter scrap point code and Press Add button$")
	public void we_enter_scrap_point_code_and_Press_Add_button() {
	   FI423CLPageObjects.ScrappointcodeField(fi423cldriver).sendKeys("1 TEST");
	   FI423CLPageObjects.AddButton(fi423cldriver).click();
	   fi423clngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^We enter product shape code$")
	public void we_enter_product_shape_code() {
	   FI423CLPageObjects.ProductShapeCodeField(fi423cldriver).sendKeys("P");   
	}
	
	@Then("^We enter Width and Length of Scrap point$")
	public void we_enter_Width_and_Length_of_Scrap_point() {
		FI423CLPageObjects.WidthField(fi423cldriver).sendKeys("48");
	    FI423CLPageObjects.LengthField(fi423cldriver).sendKeys("96");  
	}
	
	@Then("^We enter comments and press Enter key$")
	public void we_enter_comments_and_press_Enter_key() {
	   FI423CLPageObjects.CommentField(fi423cldriver).sendKeys("TEST");
	   FI423CLPageObjects.AddscrapPointButton(fi423cldriver).click();
	   
	}
	
	@Then("^press End of job button$")
	public void press_End_of_job_button() throws Exception {
		fi423clngdriver.waitForAngularRequestsToFinish();
		FI423CLPageObjects.EndofJobButton(fi423cldriver).click();
	}

	@When("^we enter scrap point code and press Update button$")
	public void we_enter_scrap_point_code_and_press_Update_button() {
		 FI423CLPageObjects.ScrappointcodeField(fi423cldriver).sendKeys("1 TEST");
		 FI423CLPageObjects.UpdateButton(fi423cldriver).click();
		 fi423clngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^change the width and length of scrap point$")
	public void change_the_width_and_length_of_scrap_point() {
	    FI423CLPageObjects.WidthField(fi423cldriver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"96");
	    FI423CLPageObjects.LengthField(fi423cldriver).sendKeys(Keys.chord(Keys.CONTROL,"a"),"48");
	}
	
	@Then("^Press Update Scrap point Code button$")
	public void press_Update_Scrap_point_Code_button() {
	    FI423CLPageObjects.UpdateScrappointButton(fi423cldriver).click();
	}
	
	@When("^we enter scrap point code and press delete button$")
	public void we_enter_scrap_point_code_and_press_delete_button() {
		 FI423CLPageObjects.ScrappointcodeField(fi423cldriver).sendKeys("1 TEST");
		 FI423CLPageObjects.DeleteButton(fi423cldriver).click();
		 fi423clngdriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^we enter Y response in Delete field$")
	public void we_enter_Y_response_in_Delete_field() {
	   FI423CLPageObjects.DeletionResponseField(fi423cldriver).sendKeys("Y");
	}
	
	@Then("^we press Delete scrap point code button$")
	public void we_press_Delete_scrap_point_code_button() {
	   FI423CLPageObjects.DeleteScrappointButton(fi423cldriver).click();
	}
	
	@Then("^return to menu screen$")
	public void return_to_menu_screen() {
		fi423clngdriver.waitForAngularRequestsToFinish();
	      String text= fi423cldriver.findElement(ByAngular.binding("menuName")).getText();
	      Assert.assertEquals(text,"Scrap Point Maintenance","Assertion Failed Menu screen not reached");
	}
}
