package basepackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Baseclass {

	private static WebDriver driver;
	private static NgWebDriver ngdriver;

	@Before
	public static void Initializebrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		ngdriver = new NgWebDriver((JavascriptExecutor)driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://lucknow.rmiproject.com/russelmetals/");
		// Thread.sleep(5000);
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(ByAngular.model("username")).sendKeys("rmidev");
		driver.findElement(ByAngular.model("password")).sendKeys("rmidev");
		driver.findElement(ByAngular.buttonText("Submit")).submit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Before("@selectdistrict15")
	public static void changetodistrict15() {
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("mainMenu_changeDistrictMenu")).click();
		ngdriver.waitForAngularRequestsToFinish();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
		driver.findElement(By.id("changeDistrictMenu_jmsRusselMetals")));
		driver.findElement(By.id("changeDistrictMenu_jmsRusselMetals")).click();
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("jmsRusselMetals_DistTo15-JmspBlytheville")).click();
		driver.findElement(By.id("app_previous")).click();
		ngdriver.waitForAngularRequestsToFinish();

	}

	@Before("@selectdistrict20")
	public static void changetodistrict20() {
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("mainMenu_changeDistrictMenu")).click();
		ngdriver.waitForAngularRequestsToFinish();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
		driver.findElement(By.id("changeDistrictMenu_jmsRusselMetals")));
		driver.findElement(By.id("changeDistrictMenu_jmsRusselMetals")).click();
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("jmsRusselMetals_DistTo20-DecaturAL")).click();
		driver.findElement(By.id("app_previous")).click();
		ngdriver.waitForAngularRequestsToFinish();

	}

	@Before("@selectdistrict30")
	public static void changetodistrict30() {
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("mainMenu_changeDistrictMenu")).click();
		ngdriver.waitForAngularRequestsToFinish();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.id("changeDistrictMenu_jmsRusselMetals")));
		driver.findElement(By.id("changeDistrictMenu_jmsRusselMetals")).click();
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("jmsRusselMetals_DistTo30-PaduchahKY")).click();
		driver.findElement(By.id("app_previous")).click();
		ngdriver.waitForAngularRequestsToFinish();

	}

	@Before("@selectdistrict35")
	public static void changetodistrict35() throws InterruptedException {
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("mainMenu_changeDistrictMenu")).click();
		ngdriver.waitForAngularRequestsToFinish();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.id("changeDistrictMenu_jmsRusselMetals")));
		driver.findElement(By.id("changeDistrictMenu_jmsRusselMetals")).click();
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("jmsRusselMetals_DistTo35-NortonMetals")).click();
		driver.findElement(By.id("app_previous")).click();
		ngdriver.waitForAngularRequestsToFinish();

	}

	@After
	public static void teardown(Scenario scenario) {
		 try {
	            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            String testName = scenario.getName();
	            scenario.embed(screenshot, "image/png");
	            scenario.write(testName);
	        } catch (WebDriverException wde) {
	            System.err.println(wde.getMessage());
	        } catch (ClassCastException cce) {
	            cce.printStackTrace();}
			driver.close();
	        }
	

	

	public static WebDriver getbaseclassdriver() {
		return driver;
	}

	public static NgWebDriver getbaseclassngdriver() {
		return ngdriver;
	}
}
