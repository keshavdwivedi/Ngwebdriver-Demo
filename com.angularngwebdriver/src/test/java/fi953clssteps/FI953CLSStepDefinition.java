package fi953clssteps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FI953CLSPageObjects;

public class FI953CLSStepDefinition {
	
	WebDriver fi953clsdriver;
	NgWebDriver fi953clsngdriver;
	
	public FI953CLSStepDefinition() {
		this.fi953clsdriver=Baseclass.getbaseclassdriver();
		this.fi953clsngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@When("^we navigate by Menu$")
	public void we_navigate_by_Menu() {
	    fi953clsngdriver.waitForAngularRequestsToFinish();
		FI953CLSPageObjects.MaterialprocessingMenu(fi953clsdriver).click();
		fi953clsngdriver.waitForAngularRequestsToFinish();
		FI953CLSPageObjects.MatprocMenuOption(fi953clsdriver).click();
		fi953clsngdriver.waitForAngularRequestsToFinish();
		FI953CLSPageObjects.BacklogFileListMenuOption(fi953clsdriver).click();
	}
	
	@Then("^click on enter button$")
	public void click_on_enter_button() {
	 fi953clsngdriver.waitForAngularRequestsToFinish();
	 FI953CLSPageObjects.Enterbutton(fi953clsdriver).click();
	 String text=fi953clsdriver.findElement(ByAngular.binding("menuName")).getText();
	 Assert.assertEquals(text,"Mat Proc/Prod Recording Rpt Menu","Assertion Failed Menu screen not reached");
	}
	

}
