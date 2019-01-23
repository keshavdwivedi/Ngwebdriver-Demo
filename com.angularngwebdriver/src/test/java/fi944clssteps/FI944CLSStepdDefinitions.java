package fi944clssteps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import basepackage.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.FI944CLSPageObjects;

public class FI944CLSStepdDefinitions {
	
	WebDriver fi944clsdriver;
	NgWebDriver fi944clsngdriver;
	public FI944CLSStepdDefinitions() {
		this.fi944clsdriver=Baseclass.getbaseclassdriver();
		this.fi944clsngdriver=Baseclass.getbaseclassngdriver();
	}
	
	@When("^we navigate By menu$")
	public void we_navigate_By_menu() {
		fi944clsngdriver.waitForAngularRequestsToFinish();
		FI944CLSPageObjects.FileMaintainenceMenu(fi944clsdriver).click();
		fi944clsngdriver.waitForAngularRequestsToFinish();
		 ((JavascriptExecutor)fi944clsdriver).executeScript("arguments[0].scrollIntoView(true);",FI944CLSPageObjects.Inventorystructuremaintainencemenutwo(fi944clsdriver));
		 FI944CLSPageObjects.Inventorystructuremaintainencemenutwo(fi944clsdriver).click();
		 fi944clsngdriver.waitForAngularRequestsToFinish();
		 FI944CLSPageObjects.Districtproductclassfilelist(fi944clsdriver).click();
	}
	
	@Then("^click on return button$")
	public void click_on_return_button() {
	fi944clsngdriver.waitForAngularRequestsToFinish();
	FI944CLSPageObjects.Enterbutton(fi944clsdriver).click();
	String text=fi944clsdriver.findElement(ByAngular.binding("menuName")).getText();
	Assert.assertEquals(text,"District Class File Listing","Assertion Failed Menu screen not reached");
	}


}
