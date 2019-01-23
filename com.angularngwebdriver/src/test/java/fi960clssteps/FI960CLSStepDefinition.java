package fi960clssteps;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FI960CLSPageObjects;

public class FI960CLSStepDefinition {
	
	WebDriver fi960clsdriver=null;
	NgWebDriver fi960clsngdriver;
	
	public FI960CLSStepDefinition() {
	
		this.fi960clsdriver=Baseclass.getbaseclassdriver();
		this.fi960clsngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@When("^We Navigate by menu$")
	public void we_Navigate_by_menu() {
		
		fi960clsngdriver.waitForAngularRequestsToFinish();
		FI960CLSPageObjects.Filemaintainencemenu(fi960clsdriver).click();
		fi960clsngdriver.waitForAngularRequestsToFinish();
		FI960CLSPageObjects.GeneralcompmaintainencemenuOne(fi960clsdriver).click();;
		fi960clsngdriver.waitForAngularRequestsToFinish();
		FI960CLSPageObjects.SalesmanMasterFileListing(fi960clsdriver).click();	
	}
	
	@Then("^press enter button$")
	public void press_enter_button() {
	    fi960clsngdriver.waitForAngularRequestsToFinish();
	    FI960CLSPageObjects.Enterbutton(fi960clsdriver).click();
	}
	
	@Then("^return back to main menu screen$")
	public void return_back_to_main_menu_screen(){
	  String Text=fi960clsdriver.findElement(ByAngular.binding("menuName")).getText();
	  Assert.assertEquals(Text,"General Comp. Info. Maint. Menu One","Assertion failed menu screen not reached");
	}

}
